public class IsSubsequence392 {

        public static boolean isSubsequence(String s, String t) {
            
            int m = s.length();
            int n = t.length();
           
            if(n==0 && m==0){
                return true;
            }
            else if(n==0){
                return false;
            }
            else if(m==0){
                return true;
            }
            
            int j=0;
            for(int i=0;i<n && j<m;i++){
                if(s.charAt(j)==t.charAt(i)){
                    j++;
                }
            }
            return (j==m);
        }
    
    public static void main(String[] args) {
        String str = "abc";
        String str2 = "ahdgbc";
        boolean res = isSubsequence(str,str2);
        System.out.println(res);
    }
}
