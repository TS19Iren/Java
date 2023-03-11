package OOP.seminar3.task1;

public class Main {
    public static void main(String[] args) throws Exception {
        FigureCollector figureCollector = new FigureCollector();
        try {
            figureCollector.addFigure(new Rectangle(4, 4));
        } catch (NegativeParamException | ZeroParamException e) {
            System.out.println("Не смогли добавить прямоугольник. Исключение: " + e.getMessage());
        }
        try {
            figureCollector.addFigure(new Square(3));
            figureCollector.addFigure(new Square(-3));
            figureCollector.addFigure(new Square(-5));
        } catch (NegativeParamException | ZeroParamException e) {
            System.out.println("Не смогли добавить квадрат. Исключение: " + e.getMessage());
        }
        try {
            figureCollector.addFigure(new Circle(3));
        } catch (IllegalCircleParamsException e) {
            System.err.println("Произошло исключение: " + e.getMessage());
        }
        try {
            figureCollector.addFigure(new Triangle(7, 14, 10));

        } catch (IllegalTriangleException e) {
            System.err.println("Произошло исключение: " + e.getMessage());
        }
        try {
            figureCollector.addFigure(new Triangle(1, 1, 3));

        } catch (IllegalTriangleException e) {
            System.err.println("Произошло исключение: " + e.getMessage());
        }

        figureCollector.getInfo();
        figureCollector.addFigure(0, new Rectangle(5, 5));
        System.out.println("------");
        figureCollector.getInfo();
        figureCollector.sortByArea();
        System.out.println("------");
        figureCollector.getInfo();

    }
}
