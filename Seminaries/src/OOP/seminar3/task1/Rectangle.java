package OOP.seminar3.task1;

public class Rectangle extends Figure {
    protected String name = "rectangle";
    protected double sideA;
    protected double sideB;

    public Rectangle(double sideA, double sideB) throws NegativeParamException, ZeroParamException {
        if (sideA < 0 || sideB < 0) {
            throw new NegativeParamException();
        }
        if (sideA == 0 || sideB == 0) {
            throw new ZeroParamException();
        }
        this.sideA = sideA;
        this.sideB = sideB;

    }

    public String getName() {
        return name;
    }

    @Override
    public void getInfo() {
        System.out.println("Name of figure: "+getName() + ", sides: "+ sideA
                +", "+sideB+", area: "+area()+", perimetr: "+perimetr());
    }

    @Override
    public double area() {
        return sideA * sideB;
    }

    @Override
    public double perimetr() {
        return 2*(sideA+sideB);
    }
}
