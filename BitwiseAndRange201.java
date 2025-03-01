
import java.util.*;
public class BitwiseAndRange201 {

    //O(n)  time complexity 

    public static int findrangeNaive(int left , int right){
        int n =left;

        for(int i = left ;i<=right;i++){
            n = n & i;
        }
        return n;
    }


    public static int findrangeefficient(int left, int right){
        int count =0;
        while(left!=right){
            left = left>>1;
            right = right>>1;
            count++;
        }
        return left<<count;
    }
    public static void main(String[] args) {
        int left = 5;
        int right = 7;
       int res = findrangeNaive(left, right);
       System.out.println(res);

       int result = findrangeefficient(left, right);
        System.out.println(result);
    }
}
