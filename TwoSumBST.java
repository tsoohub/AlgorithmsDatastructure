import java.util.ArrayList;
import java.util.List;

public class TwoSumBST {

    public boolean findTarget(TreeNode root, int k) {

        List<Integer> list = new ArrayList<>();
        inOrder(root, list);

        int low = 0;
        int high = list.size()-1;

        while (low < high) {

            int sum = list.get(low) + list.get(high);

            if(sum ==k)
                return true;
            else if(sum < k)
                low++;
            else
                high--;
        }

        return false;
    }

    private void inOrder(TreeNode root, List<Integer> list) {
        if(root ==null)
            return;

        inOrder(root.left, list);
        list.add(root.val);
        inOrder(root.right, list);
    }
}
