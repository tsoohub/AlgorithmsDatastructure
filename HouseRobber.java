public class HouseRobber {

    public int rob(int[] nums) {
        int rob = 0;
        int notrob = 0;
        for (int i = 0; i < nums.length; i++) {
            int currob = notrob + nums[i];
            notrob = Math.max(notrob, rob);
            rob = currob;
        }
        return Math.max(rob, notrob);
    }
    // [3,10,50,100,20]
    // rob = 3,     notrob = 0
    // rob = 10,    notrob = 3
    // rob = 53     notrob = 10
    // rob = 110    notrob = 53
    // rob = 163    notrob = 110
    // 163
}
