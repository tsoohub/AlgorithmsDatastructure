import java.util.HashMap;

public class FirstUniqueCharacterString {

    public int firstUniqChar(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i=0; i < s.length(); i++) {
            if(!map.containsKey(s.charAt(i))) {
                map.put(s.charAt(i), i);
            }
            else {
                map.put(s.charAt(i), -1);


            }
        }
        for(int i : map.values()) {
            System.out.println(i);
            if(i != -1)
                return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        FirstUniqueCharacterString f = new FirstUniqueCharacterString();

        System.out.println(f.firstUniqChar("leetcode"));
    }
}
