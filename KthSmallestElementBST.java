import java.util.Stack;

public class KthSmallestElementBST {

    public int kthSmallest(TreeNode root, int k) {
        Stack<TreeNode> stack = new Stack<>();
        TreeNode p = root;
        int result = 0;
        while(!stack.isEmpty() || p != null) {
            if(p != null ){
                stack.push(p);
                p = p.left;
            }
            else {
                TreeNode s = stack.pop();
                k--;
                if(k ==0) result = s.val;
                p = s.right;
            }
        }
        return result;
    }
}
