public class ComressionString {

    public int compress(char[] chars) {
        int indexAns = 0, index = 0;

        // String loop-dene
        while(index < chars.length){
            // Current char
            char currentChar = chars[index];
            int count = 0;
            // Find, there is char that equals to current char
            // Compare itself to the current char
            while(index < chars.length && chars[index] == currentChar){
                index++;
                count++;
            }
            chars[indexAns++] = currentChar;
            // if there is more than 1 reputation than i convert it to char array.
            if(count != 1)
                for(char c : Integer.toString(count).toCharArray())
                    chars[indexAns++] = c;
        }
        return indexAns;
    }


}
