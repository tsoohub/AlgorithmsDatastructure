public class SellBuyStock {

    public int maxProfit(int prices[]) {
        int minprice = Integer.MAX_VALUE;
        int maxprofit = 0;
        for(int i=0; i < prices.length; i++) {

            if(prices[i] < minprice) {
                minprice = prices[i];
            }
            else if(prices[i]-minprice > maxprofit) {
                maxprofit = prices[i] - minprice;
            }
        }
        return maxprofit;
    }

    public static void main(String[] args) {
        SellBuyStock sell = new SellBuyStock();

        System.out.println(sell.maxProfit(new int[]{7,1,5,3,6,4}));
    }
}
