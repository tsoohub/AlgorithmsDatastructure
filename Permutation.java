import java.util.ArrayList;
import java.util.List;

public class Permutation {

    public List<List<Integer>> permute(int[] nums) {

        List<List<Integer>> ps = new ArrayList<>();

        permutHelper(nums, nums.length,ps);

        return ps;
    }

    void permutHelper(int[] nums, int n, List<List<Integer>> ps) {

        if(n ==1) {
            List<Integer> permut = new ArrayList<>();
            for(int i=0; i < nums.length; i++) {
                permut.add(nums[i]);
            }
            ps.add(permut);
            return;
        }
        for(int k=0; k < n; k++) {
            swap(nums, k, n-1);
            permutHelper(nums, n-1, ps);
            swap(nums, k, n-1);
        }
    }

    private void swap(int[] nums, int i, int j) {
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }

    public static void main(String[] args) {
        Permutation p = new Permutation();

        for(List<Integer> l : p.permute(new int[]{1,1,2})) {
            for(Integer j : l) {
                System.out.print(""+j);
            }
            System.out.println("");
        }
    }
}
