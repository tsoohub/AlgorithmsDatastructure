public class LargestNumber {

    public int dominantIndex(int[] nums) {
        if(nums.length ==0) return -1;

        int max = nums[0];
        int index = 0;
        for(int i=1; i < nums.length; i++) {
            if(nums[i] > max) {
                max = nums[i];
                index = i;
            }
        }

        for(int i=0; i < nums.length; i++) {
            if(i != index && nums[i]*2 > max) {
                return -1;
            }
        }
        return index;
    }

    public static void main(String[] args) {

        LargestNumber n = new LargestNumber();

        System.out.println(n.dominantIndex(new int[]{0,0,0,1}));
    }
}
