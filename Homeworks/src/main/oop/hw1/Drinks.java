package oop.hw1;

public class Drinks extends FoodStuff{
    protected double capacity;

    public Drinks(String name, double price, Integer amount, String unitOfMeasure, Integer runOutDate, double capacity) {
        super(name, price, amount, unitOfMeasure, runOutDate);
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "Наименование товара: "+ name+'\n'+
                "объем: "+ capacity+'\n'+
                "("+unitOfMeasure+")"+'\n'+
                "цена: " + price +'\n'  +
                "количество: " + amount+'\n';
    }
}
