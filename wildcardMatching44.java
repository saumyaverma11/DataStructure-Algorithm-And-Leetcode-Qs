public class wildcardMatching44 {
      public static boolean isMatch(String s, String p) {
      int n = s.length();
      int m = p.length();

        boolean dp[][]= new boolean[n+1][m+1];
        dp[0][0]= true;


      for(int j=1;j<=m;j++){
        if(p.charAt(j-1) =='*'){
            dp[0][j]= dp[0][j-1];
        }
      }

      //fill th dp table

      for(int i=1;i<=n;i++){
        for(int j=1;j<=m;j++){
           char sc = s.charAt(i-1);
           char pc = p.charAt(j-1);

          if(pc == sc || pc == '?'){
            dp[i][j]= dp[i-1][j-1];
          } 
          else if(pc == '*'){
            dp[i][j] = dp[i-1][j] || dp[i][j-1];
          }
        }
      }
      return dp[n][m];
    }
    public static void main(String[] args) {
        String s = "cb";
        String p = "?a";
        boolean res = isMatch(s,p);
        System.out.println(res);
        String t = "aa";
        String v = "*";
        boolean res2 = isMatch(t,v);
        System.out.println(res2);
    }
}
