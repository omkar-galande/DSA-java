import java.util.*;
public class Swap {
    public static void main(String args[]){
        int[] arr = {1,2,3,4,5,6};
        System.out.println(Arrays.toString(arr));
        swap(arr, 0, 4);
        System.out.println(Arrays.toString(arr));
    }

     static void swap(int[] arr, int i, int i2) {
        int temp = arr[i];
        arr[i] = arr[i2];
        arr[i2] = temp;
       
    }
}
