//////////////////////////////////////
// GAME CONSTANTS
const STAGE_WIDTH = 600;
const STAGE_HEIGHT = 400;
const BALL_SCALE_INITIAL = .15;
const BALL_SCALE_FINAL = .55
const BALL_TIME_IN_AIR = 4000;      // milliseconds
const BALL_TIME_RANDOMIZED = 2000;  // milliseconds
const BALL_ROTATION = 1440;         // degrees


window.onload = function() {

	//////////////////////////////////////
	// HTML5 CANVAS ELEMENT
	var canvas = document.createElement("canvas");
	canvas.width = STAGE_WIDTH;
	canvas.height = STAGE_HEIGHT;
	document.body.appendChild(canvas);

	//////////////////////////////////////
	// CreateJS STAGE
	var stage = new createjs.StageGL(canvas);
	stage.mouseMoveOutside = true;
	createjs.Touch.enable(stage);

	// --- end the game
	stage.on("hitbyball", function () {
	    createjs.Touch.disable(stage);
	});

	//////////////////////////////////////
	// PRELOAD IMAGES
	var queue = new createjs.LoadQueue(false);
	queue.loadFile("image/ball.png");
	queue.loadFile("image/ball-catch.png");
	queue.loadFile("image/gym.jpg");
	queue.loadFile("image/player.png");
	queue.loadFile("image/player-dead.png");
	queue.loadFile("image/star.gif");
	queue.load();
	queue.on("complete", function () {
    
	    //////////////////////////////////////
	    // CreateJS TICKER  // Attaches Game Loop to Stage
	    createjs.Ticker.on("tick", stage);
	    createjs.Ticker.framerate = 60;

	    // --- handle getting hit by a ball, stop the bombardment
	    stage.on("hitbyball", function () {
	        createjs.Ticker.off("tick", addBalls);
	    });
	    
	    
	    //////////////////////////////////////
	    // GYM BACKGROUND OBJECT
	    var gym = new createjs.Bitmap("image/gym.jpg");
	    // gym.scaleX = STAGE_WIDTH / gym.getBounds().width;
		// gym.scaleY = STAGE_HEIGHT / gym.getBounds().height;
		gym.scaleX = 1;
	    gym.scaleY = 1;

	    // --- Add gym to stage
	    stage.addChild(gym);


	    //////////////////////////////////////
	    // SCORE OBJECT
	    var score = new createjs.Text(0, 'bold 50px sans-serif', '#FFF');
	    score.x = 20;
	    score.y = 20;

	    // --- custom properties
	    score.value = 0;

	    // --- score a point on the caught ball event
	    score.catchListener = stage.on("caughtball", function () {
	        score.value++;
	        score.text = score.value;
	        score.cache(0,0,200,50);
	    });

	    // --- Add score to stage
	    stage.addChild(score);
	    score.cache(0,0,200,50);

	    //////////////////////////////////////
	    // PLAYER GRAPHICS
	    var playerAlive = new Image();
	    playerAlive.src = "image/player.png";

	    var playerHit = new Image();
	    playerHit.src = "image/player-dead.png";

	    // PLAYER OBJECT
	    var player = new createjs.Bitmap();
	    player.image = playerAlive;
	    // player.width = player.getBounds().width;
	    // player.height = player.getBounds().height;
	    player.width = 100;
	    player.height = 100;
	    player.x = STAGE_WIDTH/2 - player.width/2;
	    player.y = STAGE_HEIGHT - player.height;

	    // --- handle mouse movement events
	    player.moveListener = stage.on("stagemousemove", function (mouseEvent) {
	        player.x = mouseEvent.stageX - player.width/2;
	    });

	    // --- handle hit by ball event
	    player.hitListener = stage.on("hitbyball", function () {
	        player.image = playerHit;
	        stage.off("stagemousemove", player.moveListener);
	    });

	    // --- Add player to stage
	    stage.addChild(player);


	    //////////////////////////////////////
	    // BALL GRAPHICS
	    var ballTossed = new Image();
	    ballTossed.src = "image/ball.png";

	    var ballCatchable = new Image();
	    ballCatchable.src = "image/ball-catch.png";

	    var ballCaught = new Image();
	    ballCaught.src = "image/star.gif";

	    // BALL CLASS
	    function Ball() {
	        /* private member */
	        var ball = new createjs.Bitmap();
	        ball.image = ballTossed;
	        ball.width = ball.getBounds().width;
	        ball.height = ball.getBounds().height;
	        ball.x = Math.floor((Math.random() * STAGE_WIDTH) + 1);
	        ball.scaleX = BALL_SCALE_INITIAL;
	        ball.scaleY = BALL_SCALE_INITIAL;
	        ball.regX = ball.width/2;
	        ball.regY = ball.height/2;

	        // --- custom properties
	        ball.state = "Tossed";
	        ball.moveToX = Math.floor((Math.random() * STAGE_WIDTH) + 1);
	        ball.moveTime = Math.floor((Math.random() * BALL_TIME_RANDOMIZED) + BALL_TIME_IN_AIR);

	        // --- move the ball using TweenJS
	        createjs.Tween.get(ball)
	                .to({scaleX: BALL_SCALE_FINAL, 
	                     scaleY: BALL_SCALE_FINAL, 
	                     x: ball.moveToX, 
	                     y: STAGE_HEIGHT + ball.height, 
	                     rotation: BALL_ROTATION},
	                ball.moveTime, createjs.Ease.getPowOut(3));

	        // --- handle mouse click events
	        ball.clickListener = ball.on("mousedown", function () {
	            ball.state = "Catchable";
	            ball.image = ballCatchable;
	        });

	        // --- call hitTest in game loop
	        ball.tickListener = ball.on("tick", function () {
	            if (ball.y > (STAGE_HEIGHT + ball.height)) {
	                // The ball passed by the player and hits the edge of the stage
	                ball.off("tick", ball.tickListener);
	                stage.removeChild(ball);

	            } else {
	                // Hit Test
	                var playerTop = ball.globalToLocal(player.x + player.width/2, player.y),
	                    playerMiddle = ball.globalToLocal(player.x + player.width/2, player.y + player.height/2); 
	                if (ball.hitTest(playerTop.x, playerTop.y) || ball.hitTest(playerMiddle.x, playerMiddle.y)) {
	                    if (ball.state === "Catchable") {
	                        ball.state = "Caught";
	                        ball.image = ballCaught;
	                        ball.regX += ball.width/4;
	                        ball.regY += ball.height/4;
	                        stage.dispatchEvent(new createjs.Event("caughtball"));
	                    } else if (ball.state === "Tossed") {
	                        ball.off("mousedown", ball.clickListener);
	                        stage.dispatchEvent(new createjs.Event("hitbyball"));
	                    }
	                }
	            }
	        });

	        // Return pointer to ball object so it can be added to the stage
	        return ball;
	    }


	    //////////////////////////////////////
	    // BALL OBJECTS
	    // --- Call addBall method EVERY FRAME
	    var addBalls = createjs.Ticker.on("tick", function addBall() {
	        var randomNumber = Math.floor((Math.random() * 60) + 1);
	        if (randomNumber === 1) {
	            stage.addChild(Ball());
	        }
	    });


	});

}