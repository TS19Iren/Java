package OOP.seminar1.task1;

public class Car extends Transport{

    public Car(String model, String color, Integer amountWheels, Integer weight, Integer speed) throws Exception {
        super(model, color, amountWheels, weight, speed);
        if(amountWheels!=4){
            throw new Exception("Ошибка");
        }
    }

}
