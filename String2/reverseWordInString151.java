import java.util.*;


public class reverseWordInString151{

    public static String reverseNaive(String s){
        s=s.trim();
        s=s.replaceAll("\\s+"," ");
        StringBuilder sb = new StringBuilder();
        String[] str = s.split(" ");
        for(int i=str.length-1;i>=0;i--){
           sb.append(str[i]);
           if(i!=0){
               sb.append(" ");
           }
        }

        return sb.toString();
    }

    public static String reverseEfficient(String s){
         s=s.trim();
        s=s.replaceAll("\\s+"," ");

        StringBuilder sb = new StringBuilder(s);
        sb.reverse();
        for(int i =0;i<s.length();i++){
            int l=i;
            while(i<s.length() && sb.charAt(i)!=' '){
                i++;
            }
            int r=i-1;
            while(l<r){
                char temp = sb.charAt(l);
                sb.setCharAt(l,sb.charAt(r));
                sb.setCharAt(r, temp);
                l++;
                r--;
            }
        }

        return sb.toString();
    }
        public static void main(String[] args) {
            String s = "the sky is blue";
            String str = reverseNaive(s);
            System.out.println(str);
            String str2 = reverseEfficient(s);
            System.out.println(str2);
        }
}