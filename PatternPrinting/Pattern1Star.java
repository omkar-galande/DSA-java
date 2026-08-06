package PatternPrinting;

public class Pattern1Star {
    public static void main(String args[]){
        pattern33(4);

    }

     static void pattern33(int n){
        
        char smallLetter = (char) ('a');

        for(int i = 0; i <= n; i++){
            
            
            for(int j = 0; j <= i; j++){
              if((int) smallLetter % 2 == 0){
              System.out.print(Character.toUpperCase(smallLetter) + " ");
            }else{
              System.out.print(Character.toLowerCase(smallLetter) + " ");
            }
            smallLetter++;
        }
            
            System.out.println();
        }
    }

    static void pattern32(int n){
        
        for(int i = 0; i <= n; i++){
            
              char letter = (char) ('A'+ (n - i) );
            for(int j = 0; j <= i; j++){
                System.out.print(letter + " ");
                letter++;
            }
            System.out.println();
        }
    }

    static void pattern31(int n){
        n = n * 2;
        for(int i = 0; i <= n ; i++){
            for(int j = 0; j <= n ; j++){
                int c =  n - Math.min(Math.min(i , j), Math.min(n - i, n - j));
                System.out.print(c + " ");
            }
            System.out.println();
        }
    }

    static void pattern30Duplicate(int n){

        for(int i = 0; i < n; i++){

            for(int j = 0; j < n - i; j ++){
                System.out.print("  ");     
            }

            for(int j = i; j >= 0; j--){
                System.out.print(j + " ");
            }

            for(int j = 1 ; j <= i; j++){
                System.out.print(j + " ");    
            }
            System.out.println();
        }
    }

    static void pattern29(int n){

        for(int row = 0; row <= n; row++){

            for(int star = 0; star <= row; star++){
                System.out.print("* ");
            }

            for(int space = 0; space < 2 * (n - row); space++){
                System.out.print("  ");
            }

            for(int star = 0; star <= row; star++){
                System.out.print("* ");
            }
            System.out.println();
        }

         for(int row = n - 1; row >= 0; row--){

            for(int star = 0; star <= row; star++){
                System.out.print("* ");
            }

            for(int space = 0; space < 2 * (n - row); space++){
                System.out.print("  ");
            }

            for(int star = 0; star <= row; star++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern27(int n) {
        int a = 1;
        int end = n * (n + 1);

        for (int i = n; i > 0; i--) {

        // Leading spaces
        for (int j = 0; j < n - i; j++) {
            System.out.print("     ");
        }

        // Left numbers
        for (int j = 0; j < i; j++) {
            System.out.print(a + "    ");
            a++;
        }

        // Starting number for right side
        int temp = end - i + 1;

        // Right numbers
        for (int j = temp; j <= end; j++) {
            System.out.print(j + "    ");
        }

        end = temp - 1;

        System.out.println();
    }
}

    static void pattern26(int n){

        for(int i = n; i >= 0; i--){

            for(int j = 0; j < i; j++){
                System.out.print(n - i + 1 + " ");
            }
            System.out.println();
        }
    }


    static void pattern23(int n){

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n - i ; j++){
                System.out.print("  ");
            }

            for(int j = 0; j < n; j++){
                if (i == 0 || j == 0  || i == n - 1 || j == n - 1 )  System.out.print("* ");
                else System.out.print("  ");
            }
            System.out.println();
        }
    }

   static void pattern22(int n){
        int a = 1;
        for(int i = 0; i < n; i++){
            
            for(int j = 0; j < i; j++){
               if ((i + j) % 2 != 0){
                System.out.print("1 ");
               }else{
                System.out.print("0 ");
               }
            }
            
            System.out.println();

        }
    }
    
    static void pattern21(int n){
        int a = 1;
        for(int i = 0; i < n; i++){
            
            for(int j = 0; j < i; j++){
                System.out.print(a + " ");
                a++;
            }
            
            System.out.println();

        }
    }

    static void pattern20(int n){

        for (int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(i == 0 || j == 0 || i == n - 1 || j == n - 1){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    static void pattern19(int n){

        for(int i = 0; i < n; i++){

            for(int j = 0 ; j < i; j++){
                System.out.print("* " );
            }
            
            for(int j = 0; j < 2 * (n - i); j++){
                System.out.print("  ");
            }
            
            for(int j = 0; j <  i; j++){
                System.out.print("* ");

            }
            System.out.println();
        }

         for(int i = n * 2 - 1  ; i  >= 0 ; i--){

            for(int j = 0 ; j < n - i; j++){
                System.out.print("* " );
            }
            
            for(int j = 0; j < 2 * i; j++){
                System.out.print("  ");
            }
            
            for(int j = 0; j < n - i; j++){
                System.out.print("* ");
               
            }
            System.out.println();
        }
    }

    static void pattern(int n){
        for (int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern1(int n){
        for (int i = 1; i <= n; i++){
            for (int j = 1; j <= n - i + 1; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

     static void pattern2(int n){
        for (int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(j   + " ");
            }
            System.out.println();
        }
    }

     static void pattern3(int n){
        for (int i = 0; i < 2 * n; i++){
            int c = i > n ? 2 * n - i : i;
            for(int j = 0 ; j < c; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
     }

     static void pattern4(int n){
        for (int i = 0; i < 2 * n; i++){
            int c = i > n ? 2 * n - i : i;

            int spaces =  n - c;

            for(int k = 0; k < spaces; k++){
                System.out.print(" ");
            }

            for(int j = 0 ; j < c; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
     }

     static void pattern5(int n){
        for(int i = 0; i <= n; i++){
            for(int space = 0; space < n - i; space++){
                System.out.print("  ");
            }

            for(int j = i; j >= 1 ; j--){
                System.out.print(j + " ");
            }

            for(int j = 2; j <= i; j++){
                System.out.print(j + " ");
            }
            
            System.out.println();
        }
    }

     static void pattern6(int n){
        for (int i = 0; i < 2 * n; i++){
            int c = i > n ? 2 * n - i : i;

            for(int space = 0; space < n - c; space++){
                System.out.print("  ");
            }

            for(int j = c; j >= 1 ; j--){
                System.out.print(j + " ");
            }

            for(int j = 2; j <= c; j++){
                System.out.print(j + " ");
            }
            
            System.out.println();
        }
     }

    static void pattern7(int n){
        n = n + 1;

        for(int i = 0 ; i < n ; i++){
            for (int space = 0; space < n - i; space++){
                System.out.print("  ");
            }

            for(int j = 0; j < i; j++){
                System.out.print("* ");
            }

            System.out.println();
        }
    }

    static void pattern8(int n){
        
        for(int i = 0 ; i < n ; i++){
        
            for (int space = 0; space < i; space++){
                System.out.print("  ");
            }

            for(int j = 0; j < n - i; j++){
                System.out.print("* ");
            }

           
            System.out.println();
        }
    }

    static void pattern9(int n){
        for (int i = 0; i < n; i++){
            int spaces = n - i;
            for(int space = 0; space < spaces; space++){
                System.out.print("  ");
            }

            for (int j = 0; j < i; j++){
                System.out.print("* ");
            }

            for (int k = 1; k < i; k++){
                System.out.print("* ");
            }
            
            System.out.println();
        }
    }

    static void pattern10(int n){
        for( int i = 0; i < n; i++){
            
            int space = i;

            for(int spaces = 0; spaces < space; spaces++){
                System.out.print("  ");
            }

            for(int j = 0; j < 2 *( n - i ) - 1; j++){
                System.out.print("* ");
            }
            
            
            System.out.println();
        }
    }

     static void pattern11(int n){
        
        for( int i = 0; i < n; i++){
            
            for(int spaces = 0; spaces < n  - i + 1; spaces++){
                System.out.print(" ");
            }

            for(int j = 0; j < i + 1; j++){
                System.out.print("* ");
            }
            
            
            System.out.println();
        }
    }

    static void pattern12(int n){
        
        for( int i = 0; i < n; i++){
            
            for(int spaces = 0; spaces <  i; spaces++){
                System.out.print(" ");
            }

            for(int j = 0; j < n - i ; j++){
                System.out.print("* ");
            }
            
            
            System.out.println();
        }
    }

     static void pattern13(int n){
        
        for( int i = 0; i < n * 2; i++){
             int noOfStar = (i < n) ? n - i : i - n + 1;
            int noOfSpace = n - noOfStar;
            for(int spaces = 0; spaces <  noOfSpace; spaces++){
                System.out.print(" ");
            }

            for(int j = 0; j < noOfStar; j++){
                System.out.print("* ");
            }
            
            
            System.out.println();
        }
    }

    static void pattern14(int n) {
            for (int i = 0; i < n; i++) {

            
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }

            // Star
            for (int j = 0; j < 2 * i + 1; j++) {

                if (i == n - 1) {          
                    System.out.print("*");
                } else if (j == 0 || j == 2 * i) { 
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }
    
    }

    static void pattern30(int n){
        
        for(int i = 0; i < n; i++){

            for(int j = 0; j < n - i; j++){
                System.out.print("  ");
            }

            for(int j = i; j > 0; j--){
                System.out.print(j + " ");
            }

            for(int j = 2; j <= i; j++){
                System.out.print(j + " ");
            }

            System.out.println();
        }
    }

     static void pattern17(int n){
        
        for(int i = 0; i < n * 2; i++){

            int c = i > n ? 2 * n - i : i;

            for(int j = 0; j < n - c; j++){
                System.out.print("  ");
            }

            for(int j = c; j > 0; j--){
                System.out.print(j + " ");
            }

            for(int j = 2; j <= c; j++){
                System.out.print(j + " ");
            }

            System.out.println();
        }
    }

    static void pattern18(int n){

        for(int i = 0; i < n; i++){

            for(int j = 0 ; j < n - i; j++){
                System.out.print("* " );
            }
            
            for(int j = 0; j < 2 * i; j++){
                System.out.print("  ");
            }
            
            for(int j = 0; j < n - i; j++){
                System.out.print("* ");

            }
            System.out.println();
        }

         for(int i = n - 2; i  >= 0 ; i--){

            for(int j = 0 ; j < n - i; j++){
                System.out.print("* " );
            }
            
            for(int j = 0; j < 2 * i; j++){
                System.out.print("  ");
            }
            
            for(int j = 0; j < n - i; j++){
                System.out.print("* ");
               
            }
            System.out.println();
        }
    }
}

