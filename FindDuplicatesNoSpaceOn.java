import java.util.ArrayList;
import java.util.List;

public class FindDuplicatesNoSpaceOn {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> dups = new ArrayList<>();
        for(int i=0; i < nums.length; ++i) {
            int index = Math.abs(nums[i]) - 1;
            if(nums[index] < 0) {
                dups.add(index+1);
            }
            nums[index] = -nums[index];
        }
        return dups;
    }
}
