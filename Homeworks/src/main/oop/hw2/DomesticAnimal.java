package oop.hw2;

import java.time.LocalDate;

public abstract class DomesticAnimal extends Animal implements IBeNice {
    protected String name;
    protected String caste;
    protected boolean vaccinations;
    protected String color;
    protected LocalDate dateOfBirth;

    public DomesticAnimal(double high, double weight, String eyeColor, String name, String caste,
                          boolean vaccinations, String color, LocalDate dateOfBirth) {
        super(high, weight, eyeColor);
        this.name = name;
        this.caste = caste;
        this.vaccinations = vaccinations;
        this.color = color;
        this.dateOfBirth = dateOfBirth;

    }

    @Override
    public String getInfo() {
        return " name: " + name +
                ", caste: " + caste +
                ", vaccinations: " + (vaccinations ? "Yes" : "No") +
                ", color: " + color +
                ", dateOfBirth: " + dateOfBirth +
                ", high: " + high +
                ", weight: " + weight +
                ", eyeColor: " + eyeColor;
    }

    @Override
    public void makeSound() {
        System.out.println("Making animal sound");
    }

    @Override
    public void beNice() {
        System.out.println("I am nice with you");
    }
}
