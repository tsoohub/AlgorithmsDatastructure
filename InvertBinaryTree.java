import java.util.HashMap;

public class InvertBinaryTree {

    public TreeNode invertTree(TreeNode root) {
        if(null == root){
            return null;
        }

        TreeNode left = invertTree(root.left);
        TreeNode right = invertTree(root.right);
        root.left = right;
        root.right = left;

        return root;
    }

    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap();

        for (int i : nums) {

            if(!map.containsKey(i)) {
                map.put(i, 1);
            }
            else {
                return false;
            }
        }
        return true;
    }

}
