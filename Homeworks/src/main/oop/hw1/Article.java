package oop.hw1;

public class Article {
    protected String name;
    protected double price;
    protected Integer amount;
    protected String unitOfMeasure;

    public Article(String name, double price, Integer amount, String unitOfMeasure) {
        this.name = name;
        this.price = price;
        this.amount = amount;
        this.unitOfMeasure = unitOfMeasure;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public Integer getAmount() {
        return amount;
    }

    public String getUnitOfMeasure() {
        return unitOfMeasure;
    }

    @Override
    public String toString() {
        return "Наименование товара: " + name + '\n' +
                "цена: " + price +'\n'+
                "количество: " + amount + "("+unitOfMeasure +")\n";
    }
}
