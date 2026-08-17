
import java.util.Arrays;

public class thirdMax {
    static int max(int[] arr){
        Arrays.sort(arr);
        
        int max = arr[arr.length - 1];
        int count = 1;

        for(int i = arr.length - 2; i >= 0; i--){
            if(arr[i] != arr[i + 1]){
                count++;

            
            if(count == 3){
                return arr[i];
            }

            }
        }
        return max;

    }

    public static void main(String[] args){
        int[] arr = {2,3,1,4,4,5};
        System.out.println(max(arr));
    }
}
