package oop.hw1;

public class FoodStuff extends Article{
    protected Integer runOutDate;

    public FoodStuff(String name, double price, Integer amount, String unitOfMeasure, Integer runOutDate) {
        super(name, price, amount, unitOfMeasure);
        this.runOutDate = runOutDate;
    }

    @Override
    public String toString() {
        return super.toString()+"срок годности: "+runOutDate+'\n';
    }
}
