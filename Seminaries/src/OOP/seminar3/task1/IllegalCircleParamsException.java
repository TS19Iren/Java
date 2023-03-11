package OOP.seminar3.task1;

public class IllegalCircleParamsException extends Exception{
    public IllegalCircleParamsException() {
        super("Радиус не может быть отрицательным или равным нулю");
    }
}
