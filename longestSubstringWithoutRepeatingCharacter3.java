import java.util.*;
public class longestSubstringWithoutRepeatingCharacter3{
    public static int lengthOfLongestSubstringArrayList(String str){
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
    
        public static int lengthOfLongestSubstringStringBuilder(String str){
            int n = str.length();
            int left=0;
            int right=0;
            int maxL =0;
            StringBuilder sb = new StringBuilder();
            while(right<n){
                char ch = str.charAt(right);
                if(!sb.toString().contains(String.valueOf(ch))){
                    sb.append(ch);
                    right++;
                    maxL= Math.max(maxL,sb.length());
                }
                else{
                    sb.deleteCharAt(0);
                    left++;
                }
            }
            return maxL;

        }

        public static int lengthOfLongestSubstringHashSet(String str){
            int n = str.length();
            HashSet<Character> hs = new HashSet<>();
            HashSet<Character> hs2 = new HashSet<>();
            int left =0;
            int right=0;
            int maxM=0;
            while(right<n){
                char ch = str.charAt(right);
                if(!hs.contains(ch)){
                    hs.add(ch);
                    hs2.add(ch);
                    maxM= Math.max(maxM, hs.size());
                    right++;
                }
                else{
                    hs.remove(str.charAt(left));
                    left++;
                }
            }
            System.out.println(hs2.toString());
            String longest = str.substring(0, left + maxM);
            System.out.println("Longest substring without repeating characters: " + longest);
            return maxM;

        }
    public static void main(String[] args) {
        String str = "abcabcbb";
        int res  = lengthOfLongestSubstringArrayList(str);
        System.out.println(res);
        int res2  = lengthOfLongestSubstringStringBuilder(str);
        System.out.println(res2);
        int res3  = lengthOfLongestSubstringHashSet(str);
        System.out.println(res3);
    }
}