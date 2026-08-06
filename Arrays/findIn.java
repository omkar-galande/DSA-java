
import java.util.Arrays;

public class findIn{
    public static void main(String[] args){

        int[] nums = { 1, 2, 3, 4, 5, 6};
        
        int k = 3;

        int n = nums.length;

        k = k % n;

        rotate(nums, 0 , n - 1);
        rotate(nums, 0, k - 1);
        rotate(nums, k, n - 1);

    }
    
    static void rotate(int[] nums, int start, int end){

        while(start < end){

            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
        System.out.println(Arrays.toString(nums));
    }
}