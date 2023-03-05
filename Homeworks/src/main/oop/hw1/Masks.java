package oop.hw1;

public class Masks extends Article{
    public Masks(String name, double price, Integer amount, String unitOfMeasure) {
        super(name, price, amount, unitOfMeasure);
    }

    @Override
    public String toString() {
        return super.toString()+'\n';
    }
}
