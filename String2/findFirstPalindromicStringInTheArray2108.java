
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
    
    public static String Palindrom2ndMethod(String[] words) {
        String str = String.join(",",words);
    int start =0;
    for(int i =0; i<=str.length();i++){
        if(i== str.length() || str.charAt(i) ==','){
            String s = str.substring(start,i);
        
                if(palindrome(s)==true){
              return s;
                 }
            start =i+1;
        }

    }
    return "";
    }
    public static void main(String[] args) {
        String words[] = {"abc","car","ada","racecar","cool"};
        String res = firstPalindrome(words);
        System.out.println(res);
        String res2 = Palindrom2ndMethod(words);
        System.out.println(res2);
    }
}
