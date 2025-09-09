import java.util.*;
public class detectCapitl520 {
    public static boolean detectCapitalUse(String word) {
        int count =0;
        int lower=0;
        for( char ch : word.toCharArray()){
            if(Character.isUpperCase(ch)){
                count++;
            }
            else{
                lower++;
            }
        }
        if(count == word.length() || lower == word.length() || (Character.isUpperCase(word.charAt(0)) && count==1)){
        return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        boolean res= detectCapitalUse(str);
        System.out.println(res);
    }
}
