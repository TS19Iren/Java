package hw5.task2;

import java.util.Comparator;
import java.util.Map;

public class ValueComparator implements Comparator<String> {

    private Map<String, Integer> map;

    public ValueComparator(Map<String, Integer> map) {
        this.map = map;
    }

    @Override
    public int compare(String o1, String o2) {
        Integer val1 = map.get(o1);
        Integer val2 = map.get(o2);
        if (val1 < val2)
            return 1;
        return -1;

    }
}
