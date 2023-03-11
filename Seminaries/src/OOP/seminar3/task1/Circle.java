package OOP.seminar3.task1;

public class Circle extends Figure {
    @Override
    public String getName() {
        return name;
    }

    @Override
    public void getInfo() {
        System.out.println("Name of figure: " + getName() + ", radius: " + r +
                ", area: " + area() + ", perimetr: " + perimetr());
    }

    protected String name = "circle";
    protected double r;

    public Circle(double r) throws IllegalCircleParamsException {
        if (r <= 0) {
            throw new IllegalCircleParamsException();
        }
        this.r = r;

    }

    @Override
    public double area() {
        return Math.round((Math.PI * r * r) * 100.0) / 100.0;
    }

    @Override
    public double perimetr() {
        return Math.round((2 * Math.PI * r) * 100.0) / 100.0;
    }
}
