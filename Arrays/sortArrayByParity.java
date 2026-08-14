import java.util.Arrays;

public class sortArrayByParity {
     static int[] sortArrayByParity(int[] nums) {
        int n = nums.length;
        int evenIndex  = 0;
        for(int i = 0; i < n; i++){
            if(nums[i] % 2 == 0){
               swap(nums, evenIndex, i);
               evenIndex++;
            }
            
        }
        return nums;
    }

    static void swap(int[] nums, int evenIndex, int i){
       int temp = nums[evenIndex];
       nums[evenIndex] = nums[i];
       nums[i] = temp;
    }

    public static void main(String[] args){
        int[]  nums = {3,1,2,4};
        System.out.println(Arrays.toString(sortArrayByParity(nums)));
    }
}
