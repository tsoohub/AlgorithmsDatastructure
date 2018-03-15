public class DetectCapital {

    public boolean detectCapitalUse(String word) {
        if(word ==null)
            return false;

        int f = word.charAt(0);
        boolean isCapital = f >= 97 && f <= 122 ? false : true; // is Capital Letter
        for(int i=1; i < word.length(); i++) {
            int lr = (int) word.charAt(i);
            boolean isBig = lr >= 97 && lr <= 122 ? false : true;

            if(isCapital && !isBig) {
                isCapital = false;
            }
            else if(isBig) {
                return false;
            }
        }
        return true;
    }
}
