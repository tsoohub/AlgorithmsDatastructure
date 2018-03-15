import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BinaryTreeInorderTraversal {

    public List<Integer> inorderTraversal(TreeNode root) {

        List<Integer> inOrder = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();

        while(root != null || !stack.isEmpty()) {

            while (root != null) {
                stack.push(root);
                root = root.left;
            }

            root = stack.pop();
            inOrder.add(root.val);
            root = root.right;
        }

        return inOrder;
    }

    public static void main(String[] args) {

        BinaryTreeInorderTraversal b = new BinaryTreeInorderTraversal();


    }
}
