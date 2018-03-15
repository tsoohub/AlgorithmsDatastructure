public class ExcelSheetColumnTitle {

    public String convertToTitle(int n) {

        int column = n;
        StringBuilder sb = new StringBuilder();

        while (column > 0) {
            int rem = column % 26;

            if (rem == 0) {
                sb.append("Z");
                column = (column / 26) - 1;
            }
            else {
                sb.append((char)((rem - 1) + 'A'));
                column = column / 26;
            }
        }
        return sb.reverse().toString();
    }
}
