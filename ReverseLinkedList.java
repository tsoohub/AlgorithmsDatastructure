import java.util.Stack;

public class ReverseLinkedList {

    public ListNode reverseList(ListNode head) {

        Stack<Integer> stack = new Stack<>();
        ListNode cur = head;
        while(cur != null) {
            stack.push(cur.val);
            cur = cur.next;
        }
        cur = head;
        while(!stack.isEmpty()) {
            cur.val = stack.pop();
            cur = cur.next;
        }
        return head;
    }
}
