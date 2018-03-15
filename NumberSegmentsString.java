public class NumberSegmentsString {
    private char WHITESPACE = ' ';

    public int countSegments(String s) {

        if(s.trim().length() ==0)
            return 0;

        s = s.trim();
        int count =0;
        String segment=null;

        for(int i=0; i < s.length(); i++) {
            char c = s.charAt(i);

            if(c ==WHITESPACE) {
                count++;
                segment = null;
            }
            else {
                segment += c;
            }
        }

        return segment != null ? ++count : count;
    }

    public static void main(String[] args) {
        NumberSegmentsString n = new NumberSegmentsString();

        System.out.println(n.countSegments("                           "));

    }
}
