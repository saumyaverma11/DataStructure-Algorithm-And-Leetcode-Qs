import java.util.*;
public class countThenoOfConsistentString1684 {
    public static boolean IsContain(String allowed, String s){
        char ch[] = s.toCharArray();
        for( int i=0;i<ch.length;i++){
            if(!allowed.contains(Character.toString(ch[i]))){
                return false;
            }
        }
        return true;
    }
    public static int countConsistentStrings(String allowed, String[] words) {
        int count=0;
        for(int i =0;i<words.length;i++){
                if(IsContain(allowed,words[i])== true){
                    count++;
                }
            }
        return count;
    }
    public static void main(String[] args) {
        String allowed = "ab";
        String words[] = {"ad","bd","aaab","baa","badab"};
        int res = countConsistentStrings(allowed,words);
        System.out.println(res);
    }
}
