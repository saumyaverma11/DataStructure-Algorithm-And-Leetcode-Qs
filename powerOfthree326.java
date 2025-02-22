import java.util.*;
public class powerOfthree326 {

        public static boolean isPowerOfThree(int n) {
            if(n==0 || n<0){
                return false;
            }
            while(n>=0){
                if(n%3 ==0){
                    n=n/3;
                    continue;
                }
                if(n==1){
                    return true;
                }
                if(n%3!=0){
                    return false;
                }
            }
            
            
            return false;
        }

        public static boolean isPowerOfThreeefficient(int n) {
            if(n<=0){
                return false;
            }
            while(n%3 ==0){
                    n=n/3;
            }
            return n==1;
        }
    
  public static void main(String[] args) {
    Scanner sc=new Scanner (System.in);
    int n=sc.nextInt();
    boolean rs = isPowerOfThree(n);
    System.out.println(rs +"\n");
    boolean res = isPowerOfThreeefficient(n);
    System.out.println(res);
    
}
}