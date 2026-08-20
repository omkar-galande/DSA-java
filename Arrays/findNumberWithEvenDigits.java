public class findNumberWithEvenDigits {
    static int evenNumberDigits(int[] nums){
        int count = 0;

        for (int n : nums){
            
            int digits = 0;
            if(n == 0){
                digits = 1;
            }else{
            while(n > 0){
                n /= 10;
                digits++;
            }
        }
            if(digits % 2 == 0){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args){
        int[] arr = {12, 333, 5322, 5673, 0};
        System.out.println(evenNumberDigits(arr));
    }
}
