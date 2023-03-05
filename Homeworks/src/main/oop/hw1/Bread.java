package oop.hw1;

public class Bread extends FoodStuff {
    protected String typeOfMeal;

    public Bread(String name, double price, Integer amount, String unitOfMeasure, Integer runOutDate, String typeOfMeal) {
        super(name, price, amount, unitOfMeasure, runOutDate);
        this.typeOfMeal = typeOfMeal;
    }

    public String getTypeOfMeal() {
        return typeOfMeal;
    }

    @Override
    public String toString() {
        return super.toString() + "срок годности:"
                + runOutDate + "\n" + "сделан из муки: " + typeOfMeal + '\n';
    }
}
