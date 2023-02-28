package seminar6.task3;

import java.time.LocalDate;

/*
Реализуйте 1 из вариантов класса Cat из предыдущего задания,
можно использовать не все придуманные поля и методы. Создайте несколько
 экземпляров этого класса, выведите их в консоль.
2. Добейтесь того, чтобы при выводе в консоль объекта типа Cat, выводилась его
кличка, цвет и возраст (или другие параметры на ваше усмотрение).
 */
public class Cat {
    String name;
    String colour;
    LocalDate dateOfBirth;

    int getAge(){
        LocalDate date = LocalDate.now();
        int age = date.getYear() - dateOfBirth.getYear();
        return age;
    }

    @Override
    public String toString() {
        return name +" "+colour+" "+getAge();
    }
}
