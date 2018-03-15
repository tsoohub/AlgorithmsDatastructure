import java.util.HashMap;

public class MajorityElement {

    public int majorityElement(int[] nums) {

        HashMap<Integer, Integer> map = new HashMap<>();
        int n = nums.length;
        int major =nums[0];

        for(int i : nums) {

            if(map.containsKey(i)) {

                int dups = map.get(i) + 1;

                if(dups > n/2) {
                    major = i;
                    break;
                }

                map.put(i, dups);
            }
            else {
                map.put(i, 1);
            }
        }

        return major;
    }

    public static void main(String[] args) {

        MajorityElement m = new MajorityElement();

        System.out.println(m.majorityElement(new int[]{1,2,2,2,8}));
    }
}
