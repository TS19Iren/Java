package oop.hw1;

public class Milk extends Drinks{
    protected double fat;

    public Milk(String name, double price, Integer amount, String unitOfMeasure, Integer runOutDate, double capacity, double fat) {
        super(name, price, amount, unitOfMeasure, runOutDate, capacity);
        this.fat = fat;
    }

    @Override
    public String toString() {
        return super.toString()+"жирность: "+fat+'\n';
    }
}
