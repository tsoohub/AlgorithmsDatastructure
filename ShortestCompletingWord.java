public class ShortestCompletingWord {

    public String shortestCompletingWord(String licensePlate, String[] words) {

        licensePlate = licensePlate.toLowerCase();

        int[] licenseCount = new int[26];
        for(char c : licensePlate.toCharArray()) {
            if(c >= 97 && c <= 122)
                licenseCount[c-'a']++;
        }

        int countLetter = Integer.MIN_VALUE;
        String word = "";
        for(String w : words) {
            w = w.toLowerCase();
            int[] letterCount = new int[26];
            for(char c : w.toCharArray()) {
                if(c >= 97 && c <= 122) {
                    letterCount[c-'a']++;
                }
            }
            int count = 0;
            for(int i=0; i < 26; i++)
                count += letterCount[i] >= licenseCount[i] ? licenseCount[i] : letterCount[i];
            if(count > countLetter) {
                word = w;
                countLetter = count;
            }
            else if(count ==countLetter && w.length() < word.length()) {
                word = w;
            }
        }
        return word;
    }

    public static void main(String[] args) {
        ShortestCompletingWord s = new ShortestCompletingWord();
        System.out.println(s.shortestCompletingWord("1s3 PSt", new String[]{"step", "steps", "stripe", "stepple"}));
    }

}
