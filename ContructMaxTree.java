public class ContructMaxTree {

    public TreeNode constructMaximumBinaryTree(int[] nums) {
        return construct(nums, 0, nums.length);
    }

    private TreeNode construct(int[] nums, int l, int r) {
        if (l == r)
            return null;
        int max_i = max(nums, l, r);
        TreeNode root = new TreeNode(nums[max_i]);
        root.left = construct(nums, l, max_i);
        root.right = construct(nums, max_i + 1, r);
        return root;
    }

    int max(int nums[], int l, int r) {
        int maxi = l;
        for(int i=l; i < r; i++) {
            if(nums[maxi] < nums[i]) {
                maxi = i;
            }
        }
        return maxi;
    }
}
