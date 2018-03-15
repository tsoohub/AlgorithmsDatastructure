public class PlusOne {

    public int[] plusOne(int[] digits) {
        int len = digits.length-1;
        int remainder = 0;

        for(int i=len; i >= 0; i--) {

            if(digits[i]+1 > 9 && i ==0) {
                // create new array with size + 1
                // copy all value to new array
                // return that array;
                int[] newarr = new int[len+2];
                newarr[0] = 1;

                return newarr;
            }
            else if(digits[i]+1 > 9) {
                digits[i] = 0;
            }
            else {
                digits[i] = digits[i] + 1;
                break;
            }
        }
        return digits;
    }

    public static void main(String[] args) {

        for(int i : new PlusOne().plusOne(new int[]{9})) {
            System.out.print(i+" ");
        }
    }
}
