import java.util.HashMap;
import java.util.Map;

public class MostFrequentSubtreeSum {
    int maxFrequency = 0;
    int maxCount = 0;
    HashMap<Integer, Integer> map = new HashMap<>();

    public int[] findFrequentTreeSum(TreeNode root) {
        if(root ==null) {
            return new int[]{};
        }

        int val = helper(root);
        updateMap(val);

        int[] arr = new int[maxCount];
        int i = 0;
        for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if(entry.getValue() ==maxFrequency) {
                arr[i++] = entry.getKey();
            }
        }
        return arr;
    }

    private int helper(TreeNode root) {

        if(root ==null) return 0;

        if(root.left ==null && root.right ==null) {
            updateMap(root.val);
            return root.val;
        }

        int subsum = helper(root.left) + helper(root.right) + root.val;
        updateMap(subsum);
        return subsum;
    }

    private void updateMap(int val) {
        if(map.containsKey(val)) {
            int freq = map.get(val) + 1;
            if(freq > maxFrequency) {
                maxFrequency = freq;
                maxCount = 1;
            }
            if(freq ==maxFrequency) {
                maxCount++;
            }
            map.put(val, freq);
        }
        else {
            map.put(val, 1);
        }
    }
}
