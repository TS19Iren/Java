package oop.hw4;

public class IllegalTypeException extends Exception{
    public IllegalTypeException() {
        super("Due to the type of this element, operation cannot be done");
    }
}
