package seminar6.task4;

import java.time.LocalDate;
import java.util.Objects;

public class Cat {
    String name;
    String colour;
    LocalDate dateOfBirth;

    public Cat(String name, String colour, LocalDate dateOfBirth) {
        this.name = name;
        this.colour = colour;
        this.dateOfBirth = dateOfBirth;
    }

    int getAge(){
        LocalDate date = LocalDate.now();
        int age = date.getYear() - dateOfBirth.getYear();
        return age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cat cat = (Cat) o;
        return Objects.equals(name, cat.name) &&
                Objects.equals(colour, cat.colour) &&
                Objects.equals(dateOfBirth, cat.dateOfBirth);
    }


//    public boolean equals(Object obj) {
//        if(this == obj){
//            return true;
//        }
//        if(obj instanceof Cat){
//            Cat cat = (Cat)obj;
//            if(this.colour.equals(cat.colour)&&this.name.equals(cat.name)&&this.dateOfBirth.equals(cat.dateOfBirth)) {
//                return true;
//            }
//        }
//        return false;
//
//    }


    @Override
    public int hashCode() {
        return Objects.hash(name, colour, dateOfBirth);
    }

    @Override
    public String toString() {
        return name +" "+colour+" "+getAge();
    }
}


