public class maxWealth {

    public static void main(String[] args){
        int[][] arr = {
            {1, 2, 3},
            {4, 5, 6}
        };

        System.out.println(maximumWealth(arr));
        
    }
    
    static int maximumWealth(int[][] accounts) {
        int maxWealth = 0;

        for(int[] customer : accounts){
            int wealth = 0;

            for(int money : customer){
                wealth += money;
            }
            maxWealth = Math.max(maxWealth , wealth);
        }
        return maxWealth;
    }
}
