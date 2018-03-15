public class RemoveDupInPlace {

    public int removeDuplicates(int[] nums) {

        int len = nums.length;

        for(int i=0; i < len-1; i++) {

            if(nums[i] ==nums[i+1]) {

                for(int j =i; j < len-1; j++) {
                    nums[j] = nums[j+1];
                }
                len--;
                i--;
            }
        }

        return len;
    }

    public static void main(String[] args) {

        RemoveDupInPlace rem = new RemoveDupInPlace();

        int newlen = rem.removeDuplicates(new int[]{1,2,3,4,4,4,4,5,5,5,5,6,7,8,8,8,8});
        System.out.println("\n"+newlen);
    }
}
