public class RotateArray {

    public static void rotate(int[] nums, int k) {

        if(k==0 || k >= nums.length - 1) return;
        if(k==1) {
            int tmp = nums[0];
            nums[0] = nums[1];
            nums[1] = tmp;
        }

        int[] tmp = new int[k+1];

        for(int i=0; i <= k; i++) {
            tmp[i] = nums[i];
        }

        int j = 0;
        for(int i = k +1; i < nums.length; i++, j++) {
            nums[j] = nums[i];
        }

        int ind=0;
        while(ind <= k) {
            nums[j++] = tmp[ind++];
        }
    }

    public static void main(String[] args) {

        int[] newi = new int[]{1,2,3,4,5,6,7};

        rotate(newi, 3);

        for(int i : newi) {
            System.out.print(i+" ");
        }
    }
}
