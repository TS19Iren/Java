package oop.hw2;

import java.time.LocalDate;

public class Cat extends DomesticAnimal {
    private final boolean isFluffy;
    private final boolean isTiger;

    public boolean isFluffy() {
        return isFluffy;
    }

    public Cat(double high, double weight, String eyeColor, String name, String caste, boolean vaccinations,
               String color, LocalDate dateOfBirth, boolean isFluffy, boolean isTiger) {
        super(high, weight, eyeColor, name, caste, vaccinations, color, dateOfBirth);
        this.isFluffy = isFluffy;
        this.isTiger = isTiger;
    }

    @Override
    public String getInfo() {
        return "Cat: " + super.getInfo() +
                ", isFluffy: " + (isFluffy?"Yes":"No") +
                ", isTiger: " + (isTiger?"Yes":"No");
    }

    @Override
    public void makeSound() {
        System.out.println("I am saying miyaaaaooo");
        ;
    }

    @Override
    public void beNice() {
        System.out.println("Frrr");
    }
}
