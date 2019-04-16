package builder;

public class BigBoxMeal extends MealBuilder
{
	public void buildFood()
	{
		meal.setFood("1个鸡腿堡+2块新奥尔良烤翅+1盒土豆泥+1只葡式蛋挞");
	}
	public void buildDrink()
	{
	    meal.setDrink("1杯大可乐");
	}
}