public class RepeatedStringMatch {

    public int repeatedStringMatch(String A, String B) {

        StringBuilder sb = new StringBuilder(A);
        int i=1;

        while(i < B.length()) {
            sb.append(A);
            i++;
        }
        if(sb.indexOf(B) >= 0) return i;
        if(sb.append(A).indexOf(B) >= 0)    return i+1;

        return -1;
    }

    public static void main(String[] args) {
        RepeatedStringMatch r = new RepeatedStringMatch();

        System.out.println(r.repeatedStringMatch("abcd", "cdabcdab"));
    }

}
