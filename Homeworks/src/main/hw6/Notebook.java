package hw6;

public class Notebook {
    private String brand;
    private String color;
    private int ram;
    private int monitorSize;
    private String videoCard;
    private int price;

    public Notebook(String color, String brand, int ram, int monitorSize, String videoCard, int price) {
        this.color = color;
        this.brand = brand;
        this.ram = ram;
        this.monitorSize = monitorSize;
        this.videoCard = videoCard;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public String getColor() {
        return color;
    }

    public int getRam() {
        return ram;
    }

    public int getMonitorSize() {
        return monitorSize;
    }

    public String getVideoCard() {
        return videoCard;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Notebook: "+brand+". Description: RAM:"+ ram +", Monitor size:"+monitorSize+", video card:"+videoCard+"."
                +"Price: "+price;
    }

}
