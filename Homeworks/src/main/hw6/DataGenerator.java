package hw6;

import java.util.Arrays;
import java.util.List;

public class DataGenerator {
    public static List<Notebook> generate(){
        Notebook notebook1 = new Notebook("black", "HP", 8, 15, "GForce", 10000);
        Notebook notebook2 = new Notebook("grey", "Lenovo", 32, 17, "GForce", 90000);
        Notebook notebook3 = new Notebook("brown", "Sony", 16, 15, "GForce", 40000);
        Notebook notebook4 = new Notebook("green", "Samsung", 32, 14, "GForce", 67000);
        Notebook notebook5 = new Notebook("red", "HP", 64, 17, "GForce", 80000);
        Notebook notebook6 = new Notebook("blue", "Lenovo", 8, 15, "GForce", 12000);
        return Arrays.asList(notebook1, notebook2, notebook3, notebook4, notebook5, notebook6);
    }
}
