import java.util.HashMap;
import java.util.HashSet;

public class StoneAndJewels {

    /*
    * Find out how many stones are jewels.
    * */
    public int numJewelsInStones(String J, String S) {
        int jewels = 0;
        HashSet<Character> set = new HashSet<>();

        for(int i=0; i < J.length(); i++) {
            set.add(J.charAt(i));
        }

        for(int j=0; j < S.length(); j++) {
            if(set.contains(S.charAt(j))) {
                jewels++;
            }
        }
        return jewels;
    }
}
