package OOP.seminar3.task1;

public class NegativeParamException extends Exception {
    public NegativeParamException() {
        super("Указан отрицательный параметр фигуры");
    }
}
