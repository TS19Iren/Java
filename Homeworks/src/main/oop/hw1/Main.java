package oop.hw1;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        FoodStuff bread = new Bread("Хлеб", 50, 500, "гр", 3, "грубый помол");
        System.out.println(bread);
        Article childstuff = new ChildArticle("Детская посуда", 200, 1, "шт", 1, true);
        System.out.println(childstuff);
        ChildArticle dipers = new Dipers("Подгузники", 1000, 45, "шт", 1, true, 15,
                18, 5, "ночные");
        System.out.println(dipers);
        Drinks drink = new Lemonade("Кола", 100, 1, "мл", 350, 1, "Лимонад");
        System.out.println(drink);
        ChildArticle dummy = new Dummy("Соска", 500, 1, "шт", 1, true);
        System.out.println(dummy);
        FoodStuff eggs = new Eggs("Яйца", 100, 1, "шт", 10, 10);
        System.out.println(eggs);
        HygieneArticle toiletPaper = new ToiletPaper("Туалетная бумага", 200, 1, "шт", 4, 3);
        System.out.println(toiletPaper);
        FoodStuff milk = new Milk("Молоко", 50, 1, "мл", 3, 1.8, 2.5);
        System.out.println(milk);
        Article mask = new Masks("Mask1", 1.23, 10, "шт");
        System.out.println(mask);
    }
}
