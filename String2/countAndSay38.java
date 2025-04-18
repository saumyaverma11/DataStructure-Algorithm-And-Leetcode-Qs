
public class countAndSay38 {
    public static String CANDS(int n){
        if(n==1){
            return "1";
        }
        if(n==2){
            return "11";
        }
        StringBuilder sb = new StringBuilder("11");
        for(int i=3;i<=n;i++){
            sb.append("&");
            StringBuilder t = new StringBuilder();
            int c=1;
                for(int j=1;j<sb.length();j++){
                    if(sb.charAt(j)!=sb.charAt(j-1)){
                        t.append(Integer.toString(c));
                        t.append(sb.charAt(j-1));
                        c=1;
                    }
                    else{
                        c++;
                    }
                }
                sb.setLength(0);
                sb.append(t);
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        int n =5;
        String str =CANDS(n);
        System.out.println(str);

    }
}
