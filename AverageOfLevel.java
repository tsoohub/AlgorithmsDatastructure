import java.util.ArrayList;
import java.util.List;

public class AverageOfLevel {

    public List<Double> averageOfLevels(TreeNode root) {

        List<List<Integer>> list = new ArrayList<>();

        helperAverage(root, list, 0);

        List<Double> res = new ArrayList<>();
        for(List<Integer> items : list) {

            int s = items.size();
            double sum = 0;
            for(Integer i : items) {
                sum += i;
            }
            res.add(sum/s);
        }
        return res;
    }

    private List<List<Integer>> helperAverage(TreeNode root, List<List<Integer>> list, int level) {
        if(root ==null)
            return null;

        if(list.size() <= level) {
            list.add(new ArrayList<>());
        }

        list.get(level).add(root.val);
        helperAverage(root.left, list, level+1);
        helperAverage(root.right, list, level+1);

        return list;
    }


}
