package oop.hw1;

public class Eggs extends FoodStuff {
    protected Integer amountInPack;
    public Eggs(String name, double price, Integer amount, String unitOfMeasure, Integer runOutDate, Integer amountInPack) {
        super(name, price, amount, unitOfMeasure, runOutDate);
        this.amountInPack = amountInPack;
    }

    @Override
    public String toString() {
        return "Наименование: " +name+'\n'+
                "количество в упаковке: " + amountInPack +
                "(" + unitOfMeasure + ")"+'\n' +
                "срок годности: " + runOutDate +'\n' +
                "цена: " + price +'\n' +
                "количество: " + amount+'\n';
    }
}
