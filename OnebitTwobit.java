public class OnebitTwobit {

    public boolean isOneBitCharacter(int[] bits) {

        int twoBit = 0;
        for(int i=0; i < bits.length-1; i++) {
            if(bits[i] ==1) {
                twoBit++;
            }
            else {
                twoBit = 0;
            }
        }
        return twoBit == 0;
    }
}
