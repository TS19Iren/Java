package oop.hw1;

public class ChildArticle extends Article{
    protected Integer minAge;
    protected boolean hyppoalergic;

    public ChildArticle(String name, double price, Integer amount, String unitOfMeasure, Integer minAge, boolean hyppoalergic) {
        super(name, price, amount, unitOfMeasure);
        this.hyppoalergic = hyppoalergic;
        this.minAge = minAge;
    }

    @Override
    public String toString() {
        return super.toString()+ "минимальный возраст: " + minAge +"\n"+
                "гиппоаллергенность:" + hyppoalergic+'\n';
    }
}
