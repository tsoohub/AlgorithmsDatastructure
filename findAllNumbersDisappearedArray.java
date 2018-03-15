import java.util.*;

public class findAllNumbersDisappearedArray {

    public List<Integer> findDisappearedNumbers(int[] nums) {

        List<Integer> lostNumbers = new ArrayList<>();
        Set<Integer> set = new HashSet<>();

        for(int i=0; i < nums.length; i++) {
            set.add(nums[i]);
        }
        for(int i=1; i <= nums.length; i++) {
            if(!set.contains(i))
                lostNumbers.add(i);
        }
        return lostNumbers;
    }

    public static void main(String[] args) {
        findAllNumbersDisappearedArray f = new findAllNumbersDisappearedArray();

        System.out.println(f.findDisappearedNumbers(new int[]{4,3,2,7,8,2,3,1}));
    }
}
