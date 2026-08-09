public class bestTImeForStocks {
    // Returns max profit for one transaction
    public static int maxProfit(int[] prices) {
        if (prices == null || prices.length < 2) return 0;
        int min = prices[0];
        int maxProfit = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < min) min = prices[i];
            else {
                int profit = prices[i] - min;
                if (profit > maxProfit) maxProfit = profit;
            }
        }
        return maxProfit;
    }

    // simple test
    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        System.out.println(maxProfit(prices)); // expected 5
    }
}

