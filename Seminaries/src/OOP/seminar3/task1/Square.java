package OOP.seminar3.task1;

public class Square extends Rectangle {
    @Override
    public String getName() {
        return name;
    }

    protected String name = "square";

    public Square(double sideA) throws NegativeParamException, ZeroParamException {
        super(sideA,sideA);
    }

    @Override
    public double area() {
        return sideA*sideA;
    }

    @Override
    public double perimetr() {
        return 4*sideA;
    }
}
