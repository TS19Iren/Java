package oop.hw1;

public class Lemonade extends Drinks{
    protected String type;

    public Lemonade(String name, double price, Integer amount, String unitOfMeasure, Integer runOutDate, double capacity, String type) {
        super(name, price, amount, unitOfMeasure, runOutDate, capacity);
        this.type = type;
    }

    @Override
    public String toString() {
        return super.toString()+
                "тип: " + type+'\n';
    }
}
