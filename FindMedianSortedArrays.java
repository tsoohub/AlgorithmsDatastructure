public class FindMedianSortedArrays {

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int med = sumOf(nums1, 0, nums1.length) / nums1.length;
        int med2 = sumOf(nums2, 0, nums2.length) / nums2.length;

        return (med + med2) / 2;
    }

    private int sumOf(int[] anArray, int start, int end) {

            if(start==end)
            return anArray[start];
        if(start<end){
            int mid=(start+end)/2;
            int lsum=sumOf(anArray,start,mid);
            int rsum=sumOf(anArray,mid+1,end);
            return lsum+rsum+anArray[mid];
        }
        return 0;
    }

    public static void main(String[] args) {

        FindMedianSortedArrays f = new FindMedianSortedArrays();

//        System.out.println(f.findMedianSortedArrays(new int[]{1,3}, new int[]{2}));
//        System.out.println(f.findMedianSortedArrays(new int[]{1,2}, new int[]{3,4}));
//
//        System.out.println((int)7/2);

        int[] test = new int[]{1,2,4,8,4};
        System.out.println(f.sumOf(test, 0, test.length));

    }
}
