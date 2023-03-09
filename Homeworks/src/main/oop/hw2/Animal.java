package oop.hw2;

public abstract class Animal implements IMakeSound, IGetInfoAboutAnimal{
    protected double high;
    protected double weight;
   protected String eyeColor;

    public Animal(double high, double weight, String eyeColor) {
        this.high = high;
        this.weight = weight;
        this.eyeColor = eyeColor;
    }
}
