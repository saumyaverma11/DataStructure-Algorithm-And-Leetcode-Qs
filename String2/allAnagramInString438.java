import java.util.ArrayList;
import java.util.List;

public class allAnagramInString438 {
    public static boolean IsCompare(int hash1[], int hash2[]){
        int i;
        for( i=0;i<256;i++){
            if(hash1[i]!=hash2[i]){
               return false;
            }
        }
        return true;
    }
    public static List<Integer> findAnagrams(String s, String p) {
        ArrayList<Integer> list = new ArrayList<>();
        if(s.length()<p.length()){
            return list;
        }
        int hash1[]= new int[256];
        int hash2[]= new int[256];
        for(int i = 0;i<p.length();i++){
            hash1[p.charAt(i)]++;
            hash2[s.charAt(i)]++;
        }
        for(int i =p.length();i<s.length();i++){
            if(IsCompare(hash1,hash2)){
                list.add(i - p.length()); // add start index of anagram
            }
            hash2[s.charAt(i)]++;
            hash2[s.charAt(i-p.length())]--;

            
        }
        if(IsCompare(hash1,hash2)){
                list.add(s.length()-p.length());
            }
        return list;
    }
    public static void main(String[] args) {
        String s="cbaebabacd";
        String t="abc";
        List res = findAnagrams(s,t);
        System.out.println(res);
    }
}
