package OOP.seminar4.task1;

import com.google.gson.Gson;

public class JsonConverter<E1> {

    public <E> String convert(E1 e, boolean isJson) {
        if (isJson) {
            return asJson(e);
        }
        return asStringBuilder(e);


    }

    private String asStringBuilder(E1 e) {
        StringBuilder sb = new StringBuilder();
        if(e instanceof Integer){
            sb.append(e);
        }
        else if(e instanceof String){
            sb.append("\"").append(e).append("\"");
        }
        else if(e instanceof Cat){
            sb.append("\"").append(e).append("\"");
        }
        return sb.toString();
    }
    private String asJson(E1 e1) {
        Gson gson = new Gson();
        return gson.toJson(e1);
    }
}
