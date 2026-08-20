
import java.util.Arrays;

public class replaceElements {
    public static void main(String[] args){
        int[] nums = {17,18,5,4,6,1};
        int[] ans = replace(nums);
        System.out.println(Arrays.toString(ans));
    }

    static int[] replace(int[] nums){
        int max = -1;
        
        for(int i = nums.length - 1; i >= 0; i--){
            int current = nums[i];

            nums[i] = max;
            if(current > max){
                max = current;
            }
        }
        return nums;
    }
}
