package oop.hw2;

public abstract class Bird extends Animal {
private final double flyHigh;

    public double getFlyHigh() {
        return flyHigh;
    }

    public void fly(){
        System.out.println("Я лечу на высоте "+ flyHigh);
    }

    protected Bird(double flyHigh) {
        super(0.0, 0.0, "");
        this.flyHigh = flyHigh;
    }
}