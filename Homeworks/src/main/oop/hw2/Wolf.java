package oop.hw2;

import java.time.LocalDate;

public class Wolf extends WildAnimal {
    private final boolean isBoss;

    public Wolf(double high, double weight, String eyeColor, String location, LocalDate dateOfAppear, boolean isBoss) {
        super(high, weight, eyeColor, location, dateOfAppear);
        this.isBoss = isBoss;
    }

    public boolean isBoss() {
        return isBoss;
    }

    @Override
    public String getInfo() {
        return "Wolf:location: " + location +
                ", dateOfAppear: " + dateOfAppear +
                ", high: " + high +
                ", weight: " + weight +
                ", eyeColor: " + eyeColor +
                ", isBoss: " + (isBoss?"Yes":"No");
    }

    @Override
    public void makeSound() {
        System.out.println("Auuuuuuuuuuuu, this is mooooooooon!");
    }
}
