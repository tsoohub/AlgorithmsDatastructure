public class FirstBadVersion {

    public int firstBadVersion(int n) {

        return helper(1,n);
    }

    public int helper(int start, int end) {
        //if(isBadVersion(start)) return start;
        long startLong = start;
        long endLong = end;
        Long middleLong = (startLong + endLong) / 2;
        int middle = middleLong.intValue();

//        if (isBadVersion(middle)) {
//            return helper(start,middle);
//        } else {
            return helper(middle + 1, end);
//        }
    }
}
