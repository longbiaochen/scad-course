package builder;

public class KidsMeal extends MealBuilder {
    @Override
    public void buildFood() {
	meal.setFood("一个鸡肉卷");
    }

    @Override
    public void buildDrink() {
	meal.setDrink("一杯果汁");
    }
}