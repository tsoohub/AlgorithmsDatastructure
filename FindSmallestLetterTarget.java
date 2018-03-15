public class FindSmallestLetterTarget {

    public char nextGreatestLetter(char[] letters, char target) {

        char min = '\uffff'; // max value of char
        for(int i=0; i < letters.length; i++) {

            if(letters[i] > target) {
                if(letters[i] < min)
                    min = letters[i];
            }
        }
        return min =='\uffff' ? letters[0] : min;
    }

    public static void main(String[] args) {

        FindSmallestLetterTarget s= new FindSmallestLetterTarget();

        System.out.println(s.nextGreatestLetter(new char[]{'c', 'f', 'j'}, 'a'));
        System.out.println(s.nextGreatestLetter(new char[]{'c', 'f', 'j'}, 'c'));
    }
}
