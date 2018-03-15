public class StrStr {

    public int strStr(String haystack, String needle) {

        int nlen = needle.length();
        int hlen = haystack.length();

        for(int i=0; i <= hlen-nlen; i++) {
            String str = haystack.substring(i, i+nlen);
            if(str.equals(needle))
                return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        StrStr str = new StrStr();

        System.out.println(str.strStr("hello", "ll"));
        System.out.println(str.strStr("aaaaa", "bba"));
    }
}
