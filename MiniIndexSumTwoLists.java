import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MiniIndexSumTwoLists {

    public String[] findRestaurant(String[] list1, String[] list2) {

        int min = Integer.MAX_VALUE;
        List<String> list = new ArrayList<>();
        HashMap<String, Integer> map = new HashMap<>();

        for(int i=0; i < list1.length; i++) {
            map.put(list1[i], i);
        }
        for(int i=0; i < list2.length; i++) {

            // Common interest restaurant
            if(map.containsKey(list2[i])) {
                int least = map.get(list2[i]) + i;
                if(least ==min) {
                    list.add(list2[i]);
                }
                else if(least < min) {
                    if(least < min) list.clear();
                    list.add(list2[i]);
                    min = least;
                }
            }
        }
        return list.toArray(new String[list.size()]);
    }
}
