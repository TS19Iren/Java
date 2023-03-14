package OOP.seminar4.task1;


/*
Написать метод получения строки в формате json, который будет работать для видов:
int
String
Оъект известного класса (например Cat)
 */
public class Main {
    public static void main(String[] args) {
        JsonConverter<Integer> integerJsonConverter = new JsonConverter<>();
        JsonConverter<String> stringJsonConverter = new JsonConverter<>();
        JsonConverter<Cat> catJsonConverter = new JsonConverter<>();

        final var intConv = integerJsonConverter.convert(1,true);
        final var strConv = stringJsonConverter.convert("asd",true);
        final var catConv = catJsonConverter.convert(new Cat("Barsik", 40),false);
        final var catConvAsJson = catJsonConverter.convert(new Cat("Barsik", 40),true);
        System.out.printf("%s %s %s %s%n", intConv, strConv, catConv,catConvAsJson);
    }
}
