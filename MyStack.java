import java.util.LinkedList;
import java.util.Queue;

public class MyStack {

    Queue<Integer> inbox;

    public MyStack()
    {
        inbox = new LinkedList<>();
    }

    /** Push element x onto stack. */
    public void push(int x) {
        inbox.add(x);

        for(int i=0; i < inbox.size() -1; i++) {
            inbox.add(inbox.poll());
        }
    }

    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        return inbox.poll();
    }


    /** Get the top element. */
    public int top() {
        return inbox.peek();
    }

    /** Returns whether the stack is empty. */
    public boolean empty() {
        return inbox.isEmpty();
    }
}