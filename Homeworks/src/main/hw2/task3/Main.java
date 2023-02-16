package hw2.task3;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;

/*
Дана json строка (можно сохранить в файл и читать из файла)
[{"фамилия":"Иванов","оценка":"5","предмет":"Математика"},
{"фамилия":"Петрова","оценка":"4","предмет":"Информатика"},
{"фамилия":"Краснов","оценка":"5","предмет":"Физика"}]

Написать метод(ы), который распарсит json и, используя StringBuilder,
создаст строки вида: Студент [фамилия] получил [оценка] по предмету [предмет].

Пример вывода:
Студент Иванов получил 5 по предмету Математика.
Студент Петрова получил 4 по предмету Информатика.
Студент Краснов получил 5 по предмету Физика.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        JsonArray jsonElements = readingJson();
        System.out.println(output(jsonElements));
    }
    static JsonArray readingJson() throws IOException {
      Reader reader = Files.newBufferedReader(Paths.get("D:\\Java_education\\Homeworks\\src\\resources\\students.json"));
      JsonArray parser = JsonParser.parseReader(reader).getAsJsonArray();
      return parser;

    }
    static String output (JsonArray a){
        StringBuilder sb = new StringBuilder();

        for (JsonElement jsonElement : a) {
            JsonObject obj = jsonElement.getAsJsonObject();
            obj.get("фамилия");
            sb.append("Студент ").append(obj.get("фамилия").getAsString())
                    .append(" получил ").append(obj.get("оценка").getAsString())
                    .append(" по предмету ").append(obj.get("предмет").getAsString()).append("\n");
        }
return sb.toString();
    }
}
