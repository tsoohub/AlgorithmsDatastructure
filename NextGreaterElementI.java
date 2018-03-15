public class NextGreaterElementI {

    public int[] nextGreaterElement(int[] nums1, int[] nums2) {

        for(int i=0; i < nums1.length; i++) {

            boolean next= false;
            boolean found = false;

            for(int j=0; j < nums2.length; j++) {
                if(nums1[i] == nums2[j])
                    found = true;
                else if(found && nums2[j] > nums1[i]){
                    nums1[i] = nums2[j];
                    next = true;
                    break;
                }
            }
            if(!next)
                nums1[i] = -1;
        }
        return nums1;
    }
}
