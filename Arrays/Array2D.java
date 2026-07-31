import java.util.Arrays;

public class Array2D{
    public static void main(String[] args) {
        int[][] arr2D = {
            {1,3,5},
            {3,5,6}
        };
        // for (int arr = 0; arr < arr2D.length; arr++) {
        //     for (int j = 0; j < arr2D[arr].length; j++) {
        //         System.out.println(arr2D);
        //     }
        // }
        for (int i = 0; i < arr2D.length; i++) {
            System.out.println(Arrays.toString(arr2D[i]));
        }
        
    }
}