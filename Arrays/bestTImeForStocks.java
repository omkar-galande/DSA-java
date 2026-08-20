public class bestTImeForStocks {
    // Returns max profit for one transaction
    public static int maxProfit(int[] prices) {
        int price = prices[0];
        int max = 0;

        for(int i = 0; i < prices.length; i++){
            price = Math.min(prices[i], price);
            int price1 = prices[i] - price;
            max = Math.max(price1, max);
        }
        return max;
    }

    // simple test
    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        System.out.println(maxProfit(prices)); // expected 5
    }
}

