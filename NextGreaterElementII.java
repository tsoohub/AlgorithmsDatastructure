public class NextGreaterElementII {

    public int[] nextGreaterElements(int[] nums) {

        int len = nums.length;
        for(int i=0; i < len; i++) {

            int c = i + 1;
            boolean next = false;
            while(c != i) {
                if(c >= len)
                    c=0;

                if(nums[c] > nums[i]) {
                    next = true;
                    nums[i] = nums[c];
                    break;
                }
                c++;
            }
            if(!next)
                nums[i] = -1;
        }
        return nums;
    }


}
