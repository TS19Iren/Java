package OOP.seminar3.task1;

public class Triangle extends Figure {
    protected String name = "triangle";
    protected double sideA;
    protected double sideB;
    protected double sideC;

    public double perimetr() {
        return sideA + sideB + sideC;
    }

    public double area() {
        double halfP = this.perimetr() / 2;
        return Math.round((Math.sqrt((halfP - sideA) * (halfP - sideB) * (halfP - sideC))) * 100.0) / 100.0;
    }

    public Triangle(double sideA, double sideB, double sideC) throws IllegalTriangleException {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
        if (!((sideA + sideB) > sideC) &&
                ((sideB + sideC) > sideA) &&
                ((sideC + sideA) > sideB)) {
            throw new IllegalTriangleException();
        }
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void getInfo() {
        System.out.println("Name of figure: " + getName() + ", sides: " + sideA
                + ", " + sideB + ", " + sideC + ", area: " + area() + ", perimetr: " + perimetr());
    }
}
