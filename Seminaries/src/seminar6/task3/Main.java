package seminar6.task3;
/*

 */
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat();
        cat1.dateOfBirth = LocalDate.of(2018,1,20);
        cat1.name = "Барсик";

        System.out.println(cat1);
        System.out.println(cat1.getAge());
    }
}
