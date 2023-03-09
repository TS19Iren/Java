package oop.hw2;

public class Chicken extends Bird {
    public Chicken(double flyHigh) {
        super(flyHigh);
        this.eyeColor = "dark red";
        this.high = 0.4;
        this.weight = 1.5;
    }


    @Override
    public String getInfo() {
        return "Chicken: high: " + high +
                ", weight:" + weight +
                ", eyeColor: " + eyeColor +
                ", fly high: " + getFlyHigh();
    }

    @Override
    public void makeSound() {
        System.out.println("Kurli, kurli...kudahhh, kudahhh");
    }
}
