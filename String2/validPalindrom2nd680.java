public class validPalindrom2nd680 {
    public static  boolean IsPalindrome(String sb, int l , int r){
        while(l<=r){
            if(sb.charAt(l) != sb.charAt(r))
            {
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
    public static boolean validPalindrome(String s) {
        int l =0;
        int r = s.length()-1;

        while(l<=r)
        {  
            if(s.charAt(l)!=s.charAt(r))
            {
                return IsPalindrome(s,l+1,r) || IsPalindrome(s,l,r-1);
            }
        l++;
        r--;
        }
        return true;
    }

    public static boolean alternativeMyApp(String s) {

        int l =0;
        int r = s.length()-1;

        while(l<=r)
        {  
            if(s.charAt(l)!=s.charAt(r))
            {
                           if(IsPalindrome(s.toString(),l+1,r))
                            {
                           return true;
                            }
                            else if(IsPalindrome(s.toString(),l,r-1))
                             {
                                  return true;
                             }
                             else{
                                return false;
                             }               
            }
            
            l++;
            r--;
        }


                
        return true;
    }
    public static void main(String[] args) {
        String s = "abca";
        boolean res = validPalindrome(s);
        System.out.println(res);
        boolean res2 = alternativeMyApp(s);
        System.out.println(res2);
    }
}
