public class ReverseString2 {

    public String reverseStr(String s, int k) {
        char a[] = s.toCharArray();

        for(int i=0; i < s.length(); i += k * 2) {

            // First k, if no enough space, get array size
            int start = i;
            int end = Math.min(start + k - 1, a.length-1);

            // reverse
            while(start < end) {
                char tmp = a[start];
                a[start++] = a[end];
                a[end--] = tmp;
            }
        }
        return new String(a);
    }
}
