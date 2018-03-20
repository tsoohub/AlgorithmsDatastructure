import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.PriorityQueue;

public class TopKFrequentElements {

    public List<Integer> topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int n: nums){
            map.put(n, map.getOrDefault(n,0)+1);
        }

        PriorityQueue<HashMap.Entry<Integer, Integer>> maxHeap =
                new PriorityQueue<>((a, b)->(b.getValue()-a.getValue()));
        for(HashMap.Entry<Integer,Integer> entry: map.entrySet()){
            maxHeap.add(entry);
        }

        List<Integer> res = new ArrayList<>();
        while(res.size()<k){
            HashMap.Entry<Integer, Integer> entry = maxHeap.poll();
            res.add(entry.getKey());
        }
        return res;
    }

    public static void main(String[] args) {
        TopKFrequentElements t = new TopKFrequentElements();

        System.out.println(t.topKFrequent(new int[]{1,1,1,2,2,3}, 2));
    }
}
