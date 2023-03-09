package oop.hw2;

import java.time.LocalDate;

public class Dog extends DomesticAnimal implements ITraining {
    private final boolean isTrained;

    public boolean isTrained() {
        return isTrained;
    }

    public Dog(double high, double weight, String eyeColor, String name, String caste, boolean vaccinations,
               String color, LocalDate dateOfBirth, boolean isTrained) {
        super(high, weight, eyeColor, name, caste, vaccinations, color, dateOfBirth);
        this.isTrained = isTrained;
    }


    @Override
    public String getInfo() {
        return "Dog: " + super.getInfo() +
                ", isTrained:" + (isTrained?"Yes":"No");
    }

    @Override
    public void makeSound() {
        System.out.println("Gav, gav");
    }

    @Override
    public void beNice() {
        System.out.println("I am your friend. i Love you and i am nice with you!!!");
    }

    @Override
    public void beTrained() {
        System.out.println("Now i know how to do so many things, because you are training me!");
    }
}
