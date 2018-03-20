import java.util.HashMap;
import java.util.HashSet;

public class SingleNumberIII {

    public int[] singleNumber(int[] nums) {

        if(nums.length ==0) return new int[]{};
        if(nums.length <=2) return nums;

        HashSet<Integer> set = new HashSet<>();

        for(int i=0; i < nums.length; i++) {
            if(!set.contains(nums[i])) {
                set.add(nums[i]);
            }
            else {
                set.remove(nums[i]);
            }
        }

        int[] res = new int[set.size()];
        int index = 0;
        for(int a : set) {
            res[index++] =a;
        }
        return res;
    }
}
