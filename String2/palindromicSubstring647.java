import java.util.*;

public class palindromicSubstring647 {

    public static boolean IsPalindrome(String str){
        int l =0;
        int r= str.length()-1;
        while(l<=r){
            if(str.charAt(l)!=str.charAt(r)){
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
    public static int substringNaive(String str){
        int count=0;
        for(int i=0;i<str.length();i++){
            for(int j=i+1;j<=str.length();j++){
                if(IsPalindrome(str.substring(i,j)) == true){
                    System.out.print(str.substring(i,j)+" ");
                    count++;
                }
            }
        }
        return count;
    }
     
    public static int expend(String str, int i,int j){
        int count=0;
        while(i>=0 && j<str.length() && str.charAt(i) == str.charAt(j)){
            count++;
            i--;
            j++;
        }
        return count;
    }
    public static int substringEffcient(String s){
        int totalCount=0;
        for(int i=0;i<s.length();i++){
            int j=i;
            int oddCount = expend(s,i,j);
            j=i+1;
            int evenCount = expend(s,i,j);
            totalCount = totalCount + oddCount + evenCount;
        }
        return totalCount;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int res =substringNaive(str);
        System.out.println(":" + res);
        int res2 = substringEffcient(str);
        System.out.println(res2);
    }
}
