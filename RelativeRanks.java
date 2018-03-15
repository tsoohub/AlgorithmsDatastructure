import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class RelativeRanks {

    public String[] findRelativeRanks(int[] nums) {
        int[] ranks = nums.clone();
        Arrays.sort(ranks);
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i<ranks.length; i++){
            map.put(ranks[i], nums.length-i);
        }
        String[] res = new String[nums.length];
        for(int i = 0; i<nums.length; i++){
            int rank = map.get(nums[i]);
            String rankStr = rank+"";
            if(rank==1) rankStr = "Gold Medal";
            else if(rank==2) rankStr = "Silver Medal";
            else if(rank==3) rankStr = "Bronze Medal";
            res[i] = rankStr;
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{5, 4, 3, 2, 1};
        RelativeRanks r= new RelativeRanks();
        String[] arr2 = r.findRelativeRanks(arr);

        for(int i=0; i < arr2.length; i++)
        System.out.println(arr2[i]);
    }
}
