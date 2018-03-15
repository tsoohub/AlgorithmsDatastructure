public class AddBinary {

    public String addBinary(String a, String b) {
        StringBuilder sum = new StringBuilder("");

        int aa = a.length();
        int bb = b.length();
        int max = Math.max(aa, bb);
        int rem = 0;

        for(int i=0; i < max; i++) {
            int d = getBit(a, aa- i - 1);
            int d2 = getBit(b, bb - i- 1);
            int add = d + d2 + rem;

            sum.append(add % 2);
            rem = add / 2;
        }
        if(rem ==1)
            sum.append("1");

        return sum.reverse().toString();
    }

    private int getBit(String a, int i) {
        if(i < 0 || i >= a.length())
            return 0;

        return a.charAt(i) == '0' ? 0 : 1;
    }

    public static void main(String[] args) {
        AddBinary ad  = new AddBinary();

        System.out.println(ad.addBinary("11000","111"));

        System.out.println(15/2);
    }
}
