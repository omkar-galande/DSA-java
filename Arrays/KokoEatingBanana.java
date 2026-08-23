public class KokoEatingBanana {
    
    static int minEatingSpeed(int[] piles, int h) {

        int low = 1;
        int high = findMax(piles);

        while (low <= high) {

            int mid = low + (high - low) / 2;

            long totalH = calculatingHours(piles, mid);

            if (totalH <= h) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return low;
    }

    static int findMax(int[] piles) {
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < piles.length; i++) {
            max = Math.max(max, piles[i]);
        }

        return max;
    }

    static long calculatingHours(int[] piles, int hourly) {
        long totalHour = 0;

        for (int i = 0; i < piles.length; i++) {

            // Ceiling division:
            // ceil(piles[i] / hourly)
            totalHour += ((long) piles[i] + hourly - 1) / hourly;
        }

        return totalHour;
    }

    public static void main(String[] args){
        int[] piles= {3,6,7,11}; 
        int h = 8;

        System.out.println(minEatingSpeed(piles,h));
    }
}
