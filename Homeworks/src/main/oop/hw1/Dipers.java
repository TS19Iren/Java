package oop.hw1;

public class Dipers extends ChildArticle{
    protected Integer minWeight;
    protected Integer maxWeight;
    protected Integer size;
    protected String type;

    public Dipers(String name, double price, Integer amount, String unitOfMeasure, Integer minAge, boolean hyppoalergic,
                  Integer minWeight, Integer maxWeight, Integer size, String type) {
        super(name, price, amount, unitOfMeasure, minAge, hyppoalergic);
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
        this.type = type;
        this.size = size;
    }

    @Override
    public String toString() {
        return super.toString()+
                "минимальный вес:" + minWeight +"\n"+
                "максимальный вес: " + maxWeight + "\n"+
                "размер: " + size +"\n"+
                "тип: " + type + '\n';
    }
}
