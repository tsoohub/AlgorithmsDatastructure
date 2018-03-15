public class NumberComplement {

    public int findComplement(int num) {

        String bin = toBinary(num);
        bin = bin.replaceAll("0", "2").replaceAll("1", "0").replaceAll("2", "1");
        return Integer.parseInt(bin, 2);
    }

    private String toBinary(int num) {
        String b= "";
        while(num > 0) {
            b += num % 2;
            num /= 2;
        }
        return new StringBuilder(b).reverse().toString();
    }

    public static void main(String[] args) {
        NumberComplement n = new NumberComplement();

        System.out.println(n.findComplement(10));
    }
}
