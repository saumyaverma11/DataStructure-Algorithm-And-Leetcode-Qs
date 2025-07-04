import java.util.*;
public class reverseString2nd541{
      public static String reverseStr(String s, int k) {
        char str[]= s.toCharArray();

        for(int i=0;i<str.length; i=i+2*k){

            int low=i;
            int high=Math.min(i+k-1,str.length-1);
            while(low<=high){
                char temp = str[low];
                str[low]=  str[high];
                str[high]= temp;
                low++;
                high--;
            }
        }

        return new String(str);
    }
    public static void main(String[] args) {
        String s = "abcdefg";
        int k=2;
        String res = reverseStr(s,k);
        System.out.println(res);
    }
}