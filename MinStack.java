import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class MinStack {

    int min = Integer.MAX_VALUE;
    Stack<Integer> stack = new Stack<>();
    /** initialize your data structure here. */
    public MinStack() {

    }

    public void push(int x) {
        if(x <= min) {
            stack.push(min);
            min = x;
        }
        stack.push(x);
    }

    public void pop() {
        if(stack.pop() == min) {
            min = stack.pop();
        }
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return min;
    }

    public static void main(String[] args) {
        MinStack min = new MinStack();

        min.push(-2);
        min.push(0);
        min.push(-3);

        System.out.println(min.getMin());

        min.pop();
        System.out.println(min.top());

        System.out.println(min.getMin());
    }
}
