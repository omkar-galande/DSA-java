import java.util.Arrays;

public class Array2D{
    public static void main(String[] args) {
        int[][] arr2D = {
            {1,3,5},
            {3,5,6}
        };
        for (int row = 0; row < arr2D.length; row++) {
            for (int col = 0; col < arr2D[row].length; col++) {
                System.out.print(Arrays.toString(arr2D[row]));
            }
            System.out.println();
        }
        // for (int i = 0; i < arr2D.length; i++) {
        //     System.out.println(Arrays.toString(arr2D[i]));
        // }
        
    }
}
