public class bestTimeToBuyAndSell121 {
    public static int maxProfit(int[] prices) {
        int min = prices[0];
        int profit =0;
        for(int i=1;i<prices.length;i++){
            int cost =prices[i]- min;
            profit = Math.max(cost, profit);
            min = Math.min(prices[i],min);
        }
        return profit;
    }
    public static void main(String[] args) {
        int arr[]= {7,1,5,3,6,4};
        int res = maxProfit(arr);
        System.out.println(res);
    }
}
