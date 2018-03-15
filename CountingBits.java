public class CountingBits {

    public int[] countBits(int num) {
        if(num ==0) return new int[]{0};
        int[] nums = new int[num];

        nums[0] = 0;
        for(int i=1; i <= num; i++) {
            int n = i;
            int count = 0;
            while(n > 0) {
                count += n & 1;
                n >>= 1;
            }
            nums[i] = count;
        }
        return nums;
    }
}
