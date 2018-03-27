import java.util.HashSet;

public class UniqueMorseCodeWords {

    String[] morseCodes = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};

    public int uniqueMorseRepresentations(String[] words) {

        HashSet<String> set = new HashSet<>();

        for(String w : words) {

            String code = "";
            for(char c : w.toCharArray()) {
                code += morseCodes[c-'a'];
            }
            if(!set.contains(code)) {
                set.add(code);
            }
        }
        return set.size();
    }

    public static void main(String[] args) {
        UniqueMorseCodeWords u = new UniqueMorseCodeWords();

        System.out.println(u.uniqueMorseRepresentations(new String[]{"gin", "zen", "gig", "msg"}));
    }
}
