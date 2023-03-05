package oop.hw1;

public class Dummy extends ChildArticle{

    public Dummy(String name, double price, Integer amount, String unitOfMeasure, Integer minAge, boolean hyppoalergic) {
        super(name, price, amount, unitOfMeasure, minAge, hyppoalergic);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
