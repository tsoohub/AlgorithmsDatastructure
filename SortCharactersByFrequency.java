import java.util.*;

public class SortCharactersByFrequency {

    public String frequencySort(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i=0; i < s.length(); i++) {
            char c = s.charAt(i);
            int freq = map.getOrDefault(c, 0)+1;
            map.put(c, freq);
        }

        PriorityQueue<Map.Entry<Character, Integer>> pq = new PriorityQueue<>(new Comparator<Map.Entry<Character, Integer>>() {
            @Override
            public int compare(Map.Entry<Character, Integer> o1, Map.Entry<Character, Integer> o2) {
                return o2.getValue() - o1.getValue();
            }
        });

        pq.addAll(map.entrySet());

        String result = "";
        while(!pq.isEmpty()) {
            Map.Entry e = pq.poll();
            for(int i=0; i < (int)e.getValue(); i++) {
                result += e.getKey().toString();
            }
        }
        return result;
    }

}
