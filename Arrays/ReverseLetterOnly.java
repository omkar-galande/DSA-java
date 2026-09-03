import java.sql.SQLOutput;

public class ReverseLetterOnly {
    static String reverseOnlyLetters(String s) {
        char[] arr = s.toCharArray();
        int i = 0;
        int j = s.length() - 1;

        while(i < j){
            char right = arr[i];
            char left = arr[j];

            if(!Character.isLetter(right)){
                i++;

            }
            else if(!Character.isLetter(left)){
                j--;
            }

            else{
                char temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }
        return new String(arr);
    }

    static void main(String[] args) {
        String s = "a-bC-dEf-ghIj";
        System.out.println(reverseOnlyLetters(s));
    }
}
