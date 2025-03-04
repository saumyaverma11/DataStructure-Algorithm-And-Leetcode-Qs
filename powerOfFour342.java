import java.util.*;

public class powerOfFour342 {
                                //time complexity O(1)
                               //Bit Manipulation


    public static boolean efficient(int n){
        if(n<=0){
          return false;
        }
        return ((n&(n-1))==0 && (n%3 ==1));
    }


                                   
                                              //time complexity O(logn)        
                                                          //Iterative
    public static boolean naive(int n){
        while(n%4 ==0 ){
            n=n/4;
        }
        return (n==1);
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean res = naive(n);
        System.out.println(res);
        boolean res2 = efficient(n);
        System.out.println(res2);
    }
}
