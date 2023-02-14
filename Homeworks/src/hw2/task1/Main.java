package hw2.task1;

/*
Дана строка sql-запроса "select * from students where ".
Сформируйте часть WHERE этого запроса, используя StringBuilder.
Данные для фильтрации приведены ниже в виде json строки.
Если значение null, то параметр не должен попадать в запрос.
Параметры для фильтрации: {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}
 */
public class Main {
    public static void main(String[] args) {
        String s = "{\"surname\":\"null\", \"name\":\"Ivanov\", \"address\":\"null\",\"country\":\"Russia\", \"city\":\"Moscow\", \"age\":\"null\"}";
        System.out.println(generateWhere(s));
    }

    static String generateWhere(String s) {
        boolean isAdd = false;
        StringBuilder sb = new StringBuilder("select * from students where ");
        s = s.replaceAll("\"", "").replaceAll("\\{", "")
                .replaceAll("}", "").replaceAll(", ", ",");
        String[] split = s.split(",");
        for (String value : split) {
            String[] keyValues = value.split(":");
            if (keyValues[1].equals("null")) {
                continue;
            }
            if (isAdd) {
                sb.append(" AND ");
            }

            sb.append(keyValues[0]).append("=").append(keyValues[1]);
            isAdd = true;

        }
        return sb.toString();

    }
}
