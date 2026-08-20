public class findPivotIndex {
    static int pivotIndex(int[] nums) {
       int totalSum = 0;
       for(int num : nums){
          totalSum += num;
       } 

       int rightSum = 0;

       for(int i = 0; i < nums.length; i++){

        int leftSum = totalSum - rightSum - nums[i];

        if(leftSum == rightSum){
            return i;
        }

        rightSum += nums[i];
       }
       return -1;
    }

    public static void main(String[] args){
        int[] nums = {1,7,3,6,5,6};
        int ans = pivotIndex(nums);
        System.out.println(ans);

    }
}
