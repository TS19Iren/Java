package oop.hw1;

public class ToiletPaper extends HygieneArticle{
protected Integer amountOfPly;
    public ToiletPaper(String name, double price, Integer amount, String unitOfMeasure, Integer amountInPack, Integer amountOfPly) {
        super(name, price, amount, unitOfMeasure, amountInPack);
        this.amountOfPly = amountOfPly;
    }

    @Override
    public String toString() {
        return "Наименование: " +name+'\n'+
                "цена: "+ price+'\n'+
                "количество в упаковке: " +amountInPack+"("+unitOfMeasure+")"+'\n'+
                "количество слоев: "+amountOfPly+'\n';
    }
}
