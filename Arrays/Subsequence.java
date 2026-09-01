public class Subsequence {
    static int appendCharacters(String s, String t) {
        int i = 0,j = 0;

        while(i < s.length() && j < t.length()){
            if (s.charAt(i) == t.charAt(j)){
                j++;
            }
            i++;
        }
        return t.length() - j;
    }

    static void main(String[] args) {
        String  s = "coaching", t = "coding";
        System.out.println(appendCharacters(s, t));
    }
}
