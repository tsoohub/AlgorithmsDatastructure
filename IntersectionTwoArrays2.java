import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class IntersectionTwoArrays2 {

    public int[] intersect(int[] nums1, int[] nums2) {
        if(nums1.length == 0 || nums2.length ==0) return new int[]{};

        List<Integer> list = new ArrayList();
        HashMap<Integer, Integer> hashMap = new HashMap<>();

        for(int i=0; i < nums1.length; i++) {
            hashMap.put(nums1[i], hashMap.getOrDefault(nums1[i], 0)+1);
        }

        for(int j=0; j < nums2.length; j++) {
            if( hashMap.containsKey(nums2[j]) && hashMap.get(nums2[j]) != 0 ) {
                list.add(nums2[j]);
                hashMap.put(nums2[j], hashMap.get(nums2[j] -1 ) );
            }
        }
        return list.stream().mapToInt(i -> i).toArray();
    }

    public static void main(String[] args) {
        IntersectionTwoArrays2 i = new IntersectionTwoArrays2();
        for(int ia : i.intersect(new int[]{1,2,2,1}, new int[]{2,2}) )
        System.out.print(ia);
    }
}
