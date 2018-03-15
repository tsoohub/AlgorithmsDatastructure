public class CountBinarySubstrings {

    public int countBinarySubstrings(String s) {

        int zero = 0;
        int one = 1;

        int count =0;
        char prev ='2';
        for(int i=0; i < s.length(); i++) {

            if(s.charAt(i) =='0') {
                if(prev=='1')
                    count++;

                zero++;
                if(zero ==one) {
                    one=0;
                    count++;
                }
            }
            else if(s.charAt(i) =='1') {
                if(prev == '0')
                    count++;

                one += 1;
                if(zero ==one) {
                    zero = 0;
                    count++;
                }
            }

            prev=s.charAt(i);
        }
        return count;
    }

    /*
    * int prevRunLength = 0, curRunLength = 1, res = 0;
    for (int i=1;i<s.length();i++) {
        if (s.charAt(i) == s.charAt(i-1)) curRunLength++;
        else {
            prevRunLength = curRunLength;
            curRunLength = 1;
        }
        if (prevRunLength >= curRunLength) res++;
    }
    return res;
    * */

}
