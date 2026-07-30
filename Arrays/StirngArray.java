import java.util.Arrays;
import java.util.Scanner;

public class StirngArray {
    static void main(String[] args) {
        String[] arr = new String[5];
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.next();
        }
        System.out.println(Arrays.toString(arr));
        arr[2] = "Galande";
        System.out.println(Arrays.toString(arr));
    }
}
