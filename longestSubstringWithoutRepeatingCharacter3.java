import java.util.*;
public class longestSubstringWithoutRepeatingCharacter3{
    public static int lengthOfLongestSubstring(String str){
        int n = str.length();
        int left=0;
        int right=0;
        int maxL=0;
        ArrayList<Character> list = new ArrayList<>();
        while(right<n){
            if(!list.contains(str.charAt(right))){
                list.add(str.charAt(right));
                right++;
                maxL = Math.max(maxL, list.size());
            }
            else{
                list.remove(Character.valueOf(str.charAt(left)));
                left++;
            }
           }

       return maxL;
        }
    
    public static void main(String[] args) {
        String str = "abcabcabc";
        int res  = lengthOfLongestSubstring(str);
        System.out.println(res);
    }
}