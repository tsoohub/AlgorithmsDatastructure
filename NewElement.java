public class NewElement {

    public int removeElement(int[] nums, int val) {

        int len = nums.length;
        for(int i=0; i < nums.length; i++) {

            if(nums[i] == val) {
                nums[i] = 0;
                len--;
            }
        }

        return len;
    }

    public static void main(String[] args) {

        NewElement neel = new NewElement();

        System.out.println(neel.removeElement(new int[]{3,2,2,3}, 3));
        System.out.println(neel.removeElement(new int[]{3,2,2,3}, 3));
    }
}
