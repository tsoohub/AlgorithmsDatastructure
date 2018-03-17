public class SingleElementSortedArray {

    public int singleNonDuplicate(int[] nums) {

        int start = 0;
        int end = nums.length - 1;

        while (start < end) {

            int mid = (start + end) / 2;

            if(mid % 2 ==1)
                mid--;

            if(nums[mid] != nums[mid+1]) {
                end = mid;
            }
            else {
                start = mid + 2;
            }
        }
        return nums[start];
    }


    public static void main(String[] args) {

        SingleElementSortedArray e = new SingleElementSortedArray();

        System.out.println(e.singleNonDuplicate(new int[]{3,3,7,7,10,11,11}));
    }
}
