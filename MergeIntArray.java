public class MergeIntArray {

    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int i = 0;
        int j = 0;
        int k = 0;

        int[] tmp = new int[nums1.length];

        while(i < m && j < n) {

            if(nums1[i] > nums2[j]) {
                tmp[k++] = nums2[j++];
            }
            else {
                tmp[k++] = nums1[i++];
            }
        }

        while(i < m) {
            tmp[k++] = nums1[i++];
        }
        while(j < n) {
            tmp[k++] = nums2[j++];
        }

        for(int l=0; l < tmp.length; l++) {
            nums1[l] = tmp[l];
        }
    }



}
