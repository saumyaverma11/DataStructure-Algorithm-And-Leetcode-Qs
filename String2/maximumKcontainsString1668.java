import java.util.*;
public class maximumKcontainsString1668 {
    public static int findMaximumKConsecutive(String str,String pattern){
        int count=0;
        StringBuilder sb = new StringBuilder(pattern);
        while(str.contains(sb.toString())){
            count++;
            sb.append(pattern);
        }
        return count;
    }
    public static void main(String[] args) {
        String str  = "aaabaaaabaaabaaaabaaaabaaaabaaaaba";
        String pattern = "aaaba";
        int res = findMaximumKConsecutive(str,pattern);
        System.out.println(res);
    }
}
