public class AddStrings {

    public String addStrings(String num1, String num2) {
        StringBuilder sb = new StringBuilder();
        int i = num1.length() - 1, j = num2.length() - 1;
        int remainder = 0;
        while (i >= 0 || j >= 0) {
            if (i >= 0) {
                remainder += num1.charAt(i) - '0';
                i--;
            }
            if (j >= 0) {
                remainder += num2.charAt(j) - '0';
                j--;
            }
            sb.append(remainder % 10);
            remainder /= 10;
        }
        if (remainder != 0) {
            sb.append(remainder);
        }
        return sb.reverse().toString();
    }

}
