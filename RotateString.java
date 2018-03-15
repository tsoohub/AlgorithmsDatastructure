public class RotateString {

    public boolean rotateString(String A, String B) {
        if(A.length() != B.length())    return false;

        for(int i=1; i < A.length(); i++) {
            String sub = A.substring(i) + A.substring(0, i);
            if(sub.equals(B))
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
        RotateString r = new RotateString();

        r.rotateString("abcde", "cdeab");
    }
}
