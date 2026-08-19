public class FindMaxConsecmainutiveOnes {
    static int findMaxConsecutiveOnes1(int[] nums) {

        int count = 0;
        int max = 0;

        for(int i = 0; i < nums.length; i++) {

            if(nums[i] == 1) {
                count++;

                max = Math.max(max, count);

            } else {
                count = 0;
            }
        }

        return max;
    }

    public static void main(String args[]){
        int[] arr = {1,1,0,1,1,1,0,1};
        int ans = findMaxConsecutiveOnes1(arr);
        System.out.println(ans);
    }
}
