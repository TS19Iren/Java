package oop.hw2;

import java.time.LocalDate;

public abstract class WildAnimal extends Animal{
    protected String location;
    protected LocalDate dateOfAppear;

    public WildAnimal(double high, double weight, String eyeColor, String location, LocalDate dateOfAppear) {
        super(high, weight, eyeColor);
        this.location = location;
        this.dateOfAppear = dateOfAppear;
    }
}
