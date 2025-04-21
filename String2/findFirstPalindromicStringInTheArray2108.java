
public class findFirstPalindromicStringInTheArray2108 {
    public static boolean palindrome(String str){
        int l=0;
        int r= str.length()-1;
        while(l<=r){
            if(str.charAt(l)!= str.charAt(r)){
                return false;
            }
               l++;
               r--;
        }
        return true;
    }
    public static String firstPalindrome(String[] words) {
        for(int i =0;i<words.length;i++){
         if(palindrome(words[i])==true){
             return words[i];
         }
        }
        return "";
    }
    public static void main(String[] args) {
        String words[] = {"abc","car","ada","racecar","cool"};
        String res = firstPalindrome(words);
        System.out.println(res);
    }
}
