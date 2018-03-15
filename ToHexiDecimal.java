public class ToHexiDecimal {



    public String toHex(int num) {

        if(num == 0) return "0";
        String result = "";

        char[] map = {'0','1','2','3','4','5','6','7','8','9','a','b','c','d','e','f'};
        while(num != 0) {
            result = map[(num & 15)] + result;
            num = (num >>> 4);
        }
        return result;
    }
}
