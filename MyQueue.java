import java.util.Stack;
import java.io.IOException;

class MyQueue {

    Stack<Integer> input;
    Stack<Integer> output;

    /** Initialize your data structure here. */
    public MyQueue() {
        input = new Stack<>();
        output = new Stack<>();
    }

    /** Push element x to the back of queue. */
    public void push(int x) {
        input.push(x);
    }

    /** Removes the element from in front of queue and returns that element. */
    public int pop() throws Exception {
        if(empty())
            return Integer.parseInt(null);

        in2out();
        return output.pop();
    }

    /** Get the front element. */
    public int peek() throws Exception {
        if(empty())
            return Integer.parseInt(null);

        in2out();
        return output.peek();
    }

    private void in2out(){
        if(output.empty())
            while(!input.empty())
                output.push(input.pop());
    }

    /** Returns whether the queue is empty. */
    public boolean empty() {
        return input.empty() && output.empty();
    }

    public static void main(String[] args) throws Exception {
        int x = 12;


        MyQueue obj = new MyQueue();
        obj.push(x);
        obj.push(13);
        obj.push(14);
        obj.push(15);
        obj.push(16);

        int param_2 = obj.pop();
        int param_3 = obj.peek();
        boolean param_4 = obj.empty();

        System.out.println(param_2);
        System.out.println(param_3);
        System.out.println(param_4);


    }
}



