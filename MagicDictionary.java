import java.util.HashSet;

public class MagicDictionary {

    HashSet<String> dictionary;
    public MagicDictionary() {
        dictionary = new HashSet<>();
    }

    public void buildDict(String[] dict) {
        for(String d : dict) {
            dictionary.add(d);
        }
    }

    public boolean search(String word) {
        if(word.length() ==0)   return false;
        if(word.length() ==1)   return dictionary.contains(word);

        String w = word;
        for(int i = 0; i < w.length(); i++) {
            char c = word.charAt(i);

            for(char cr = 'a'; cr <= 'z'; cr++ ) {
                if(c ==cr) continue;
                String rep = replace(word, i, cr);
                if(dictionary.contains(rep)) return true;
            }
        }

        return false;
    }

    private String replace(String word, int location, char replacement) {
        if(location ==0) return replacement+word.substring(location+1);
        if(location ==word.length()-1) return word.substring(0, location) + replacement;

        return word.substring(0, location) + replacement + word.substring(location+1);
    }

    public static void main(String[] args) {

        MagicDictionary magic = new MagicDictionary();
        String w = "hello";

        magic.buildDict(new String[]{"hello"});
        System.out.println(magic.search("hello"));
    }
}
