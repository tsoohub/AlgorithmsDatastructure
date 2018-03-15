public class LengthOfLastWord {

    public int lengthOfLastWord(String s) {
        int len = s.length();
        if(len ==0)
            return 0;

        String[] arr = s.split(" ");
        return arr.length != 0 ? arr[arr.length-1].length() : 0;
    }

    public static void main(String[] args) {
        LengthOfLastWord l = new LengthOfLastWord();

        System.out.println(l.lengthOfLastWord("HEllo world"));
    }
}
