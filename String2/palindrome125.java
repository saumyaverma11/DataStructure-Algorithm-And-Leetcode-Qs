
import java.util.*;

public class palindrome125 {
   

    public static boolean palinD(String s)
    {
        StringBuilder sb = new StringBuilder();

        for(char ch : s.toCharArray()){
            if(Character.isLetterOrDigit(ch)){
                sb.append(Character.toLowerCase(ch));
            }
        }

        int low =0;
        int high = sb.length()-1;
        while(low<high){
            if(sb.charAt(low)!= sb.charAt(high)){
                return false;
            }
            low++;
            high--;
        }
        return true;


              // Check Palindrome is or not , using String function in java
                
            // String reversed = sb.reverse().toString();
            // return sb.reverse().toString().equals(reversed);

    }
    public static void main(String[] args) {
        String  s= "A man, a plan, a canal: Panama";
         boolean res = palinD(s);
         System.out.println(res);
    }
}


