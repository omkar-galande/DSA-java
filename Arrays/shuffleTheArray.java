
import java.util.Arrays;

public class shuffleTheArray {
    public static void main(String[] args){
        int[] arr = {1, 2, 3, 4, 5, 6};
        int n = 3;
        shuffle(arr , n);
    }

     static void shuffle(int[] arr, int n) {
        int[] ans = new int[2 *n];
        int j = 0;

        for(int i = 0; i < n; i++){
            ans[j++] = arr[i];
            ans[j++] = arr[i + n];
        }
        System.out.println(Arrays.toString(ans));
    }
}

