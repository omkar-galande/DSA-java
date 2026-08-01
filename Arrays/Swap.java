import java.util.*;
public class Swap {
    public static void main(String args[]){
        int[] arr = {1,2,3,4,5,6};
        System.out.println(Arrays.toString(arr));
        // swap(arr, 0, 4);
        // System.out.println(Arrays.toString(arr));
        System.out.println("after reverse");
        reverse(arr);
        System.out.println(Arrays.toString(arr));
     }

     static void swap(int[] arr, int i, int i2) {
        int temp = arr[i];
        arr[i] = arr[i2];
        arr[i2] = temp;
       
     }
      static void reverse(int[] arr){
        int start = 0;
        int end = arr.length - 1;
        while (start < end){
            swap(arr, start, end);
            start++;
            end -= 1;
        }
       
    }
}
