package OOP.seminar3.task1;

public class IllegalTriangleException extends Exception {
    public IllegalTriangleException() {
        super("Такого треугольника не может существовать");
    }
}
