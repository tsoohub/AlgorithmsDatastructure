public class Number1Bits {

    public int hammingWeight(int n) {

        int count = 0;
        for(int i = 0; i < 32; i++){
            count += (n >> i & 1);
        }
        return count;
    }

    public static void main(String[] args) {
        Number1Bits b = new Number1Bits();

        System.out.println(b.hammingWeight(11));
    }
}
