import java.util.*;
public class checkNoSumofPowersOfThree1780{

    public static boolean checkByInterative(int n){
        while(n>0){
            int rem = n%3;
           if(rem ==2){
            return false;
           }
           n=n/3;
        }
        return true;
    }
    public static boolean checkByRecursion(int n){
        if(n==0) return true;
        if(n%3 == 2) return false;
        return checkByRecursion(n/3);
    }
    public static boolean checkByBitMan(int n){
        return Integer.toString(n,3).indexOf('2')==-1;
    } 
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
       boolean res1 =   checkByInterative(n);
        boolean res2 = checkByRecursion(n);
        boolean res3= checkByBitMan(n);
        System.out.println("Iterative: "+ res1);
        System.out.println("Recursion:" +res2);
        System.out.println("Bit manipulation:" + res3);
    }
}