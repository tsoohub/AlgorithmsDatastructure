public class MaxConsecutiveOnes {

    public int findMaxConsecutiveOnes(int[] nums) {

        int max = 0;
        int consecutive = 0;

        for(int i=0; i < nums.length; i++) {
            if(nums[i] ==1)
                consecutive++;
            else if(nums[i] ==0 && consecutive != 0) {
                if(consecutive > max)
                    max = consecutive;
                consecutive = 0;
            }
        }
        return consecutive != 0 && consecutive > max ? consecutive : max;
    }


}
