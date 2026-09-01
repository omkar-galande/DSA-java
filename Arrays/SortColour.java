import java.util.Arrays;

public class SortColour {

    public static void main(String[] args) {
        int[] nums = {2, 2, 2, 1, 1, 1, 0, 0, 0};
        System.out.println(Arrays.toString(sortColors(nums)));
    }

    public static int[] sortColors(int[] nums) {
        int i = 0;
        int j = nums.length - 1;
        int k = 0;

        while(k <= j){
            if(nums[k] == 1){
                k++;
            }
            else if(nums[k] == 2){
                int temp = nums[j];
                nums[j] = nums[k];
                nums[k] = temp;
                j--;
            }else{
                int temp = nums[i];
                nums[i] = nums[k];
                nums[k] = temp;
                i++;
                k++;
            }
        }
        return nums;
    }
}
