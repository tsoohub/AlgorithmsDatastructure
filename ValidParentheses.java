import java.util.Stack;

public class ValidParentheses {

    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();
        String str = s;

        for(int i=0; i <str.length(); i++) {
            char c = str.charAt(i);
            if(c =='(') {
                stack.push(')');
            }
            else if(c =='{') {
                stack.push('}');
            }
            else if(c =='[') {
                stack.push(']');
            }
            else if(stack.empty() || stack.pop() != c){
                return false;
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        ValidParentheses v = new ValidParentheses();

        System.out.println(v.isValid("({})"));
    }
}
