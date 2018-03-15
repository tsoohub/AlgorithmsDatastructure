import java.util.HashMap;
import java.util.Map;

public class IntersectionTwoArrays {

    public int[] intersection(int[] nums1, int[] nums2) {

        HashMap<Integer, Integer> map = new HashMap<>();
        int count = 0;

        for(int i=0; i < nums1.length; i++) {
            if(!map.containsKey(nums1[i]))
                map.put(nums1[i], 0);
        }

        for(int i=0; i < nums2.length; i++) {

            if(map.containsKey(nums2[i]) && map.get(nums2[i]) ==0) {
                count++;
                map.put(nums2[i], 1);
            }
        }

        int[] newArr = new int[count];
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if(entry.getValue() ==1) {
                newArr[--count] = entry.getKey();
            }
        }

        return newArr;
    }
}
