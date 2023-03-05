package OOP.seminar1.task1;

public class Transport {
    protected String model;
    protected String color;
    protected Integer amountWheels;
    protected Integer weight;
    protected Integer speed;

    public Transport(String model, String color, Integer amountWheels, Integer weight, Integer speed) {
        this.model = model;
        this.color = color;
        this.amountWheels = amountWheels;
        this.weight = weight;
        this.speed = speed;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public Integer getAmountWheels() {
        return amountWheels;
    }

    public Integer getWeight() {
        return weight;
    }

    public Integer getSpeed() {
        return speed;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setAmountWheels(Integer amountWheels) {
        this.amountWheels = amountWheels;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public void setSpeed(Integer speed) {
        this.speed = speed;
    }


    public void drive(){
        System.out.println("Едет");
    }
}
