package oop.hw2;

public class Stork extends Bird {
    protected Stork(double flyHigh) {
        super(flyHigh);
        this.eyeColor = "light blue";
        this.high = 1.0;
        this.weight = 4.0;
    }


    @Override
    public String getInfo() {
        return "Stork: high:" + high +
                ", weight: " + weight +
                ", eyeColor: " + eyeColor;
    }

    @Override
    public void makeSound() {
        System.out.println("I am stork, i don`t know how to kurlik");
    }
}
