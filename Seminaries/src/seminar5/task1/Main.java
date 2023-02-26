package seminar5.task1;

import java.awt.*;

public class Main {
    public static void main(String[] args) {
        Passports passports = new Passports();
        passports.add("123456", "Иванов");
        passports.add("566343", "Петров");
        passports.add("533331", "Сидоров");
        passports.add("131325", "Кукуськин");
        passports.add("513131", "Иванов");
        passports.add("131313", "Петров");
        passports.add("131315", "Иванов");
    passports.print("Иванов");
    }

}
