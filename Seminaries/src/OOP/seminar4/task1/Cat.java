package OOP.seminar4.task1;

public class Cat {
    private String name;
    private int high;

    public Cat(String name, int high) {
        this.name = name;
        this.high = high;
    }

    public String getName() {
        return name;
    }

    public int getHigh() {
        return high;
    }

    @Override
    public String toString() {
        return "{" +
                "\"name\":\"" + name +
                "\", \"high\":" + high +
                "}";
    }
}
