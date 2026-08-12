public class findNumbers {
      static int findNumbers(int[] nums) {
        int n = nums.length;
        int count = 0;
        for(int i = 0; i < n; i++){
            int digit = 0;
            while(nums[i] > 0){
                digit++;
                nums[i] /= 10;

            }
            if(digit % 2 == 0)
            count++;
        }
        return count;
    }

    public static void main(String []args){
        int[] nums = {222, 54, 3, 4322};
        System.out.println(findNumbers(nums));
    }
}
