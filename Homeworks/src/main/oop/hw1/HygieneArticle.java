package oop.hw1;

public class HygieneArticle extends Article{
    protected  Integer amountInPack;
    public HygieneArticle(String name, double price, Integer amount, String unitOfMeasure, Integer amountInPack) {
        super(name, price, amount, unitOfMeasure);
        this.amountInPack = amountInPack;
    }

    @Override
    public String toString() {
        return super.toString()+"количество в упаковке: "+amountInPack+'\n';
    }
}
