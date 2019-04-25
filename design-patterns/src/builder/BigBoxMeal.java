package builder;

public class BigBoxMeal extends MealBuilder {
    @Override
    public void buildFood() {
	meal.setFood("1¸ö¼¦ÍÈ±¤+2¿éĞÂ°Â¶ûÁ¼¿¾³á+1ºĞÍÁ¶¹Äà+1Ö»ÆÏÊ½µ°Ì¢");
    }

    @Override
    public void buildDrink() {
	meal.setDrink("1±­´ó¿ÉÀÖ");
    }
}