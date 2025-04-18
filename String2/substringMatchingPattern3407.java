public class substringMatchingPattern3407 {
    public static boolean match(String s, String p) {
        if (!p.contains("*")) {
           return s.contains(p);
       }

       String[] str = p.split("\\*",-1);
       String prefix = str[0];
       String suffix = (str.length>1)?str[1]:"";
       
       int minLen = prefix.length() + suffix.length();
       for(int i =0;i<=s.length();i++){
           for(int j =i + minLen;j<=s.length();j++){
               String sub = s.substring(i,j);
               if(sub.startsWith(prefix) && sub.endsWith(suffix)){
                   return true;
               }
           }

       }
       return false;

   }
    public static void main(String[] args) {
        String str ="leetcode";
        String str2 ="ee*e";
        boolean res = match(str,str2);
        System.out.println(res);
    }
}
