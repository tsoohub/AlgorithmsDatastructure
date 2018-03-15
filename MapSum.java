import java.util.HashMap;
import java.util.Map;

public class MapSum {

    HashMap<String, Integer> map;
    public MapSum() {
        map = new HashMap<>();
    }

    public void insert(String key, int val) {
        map.put(key, val);
    }

    public int sum(String prefix) {
        int sum = 0;
        for (Map.Entry pair : map.entrySet()) {
            if(pair.getKey().toString().startsWith(prefix)) {
                sum += Integer.parseInt(pair.getValue().toString());
            }
        }
        return sum;
    }
}
