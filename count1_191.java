import java.util.*;

public class count1_191 {
    public static int count(int n){
        int count =0;
        while(n>0){
            n= n&(n-1);
            count++;
        }
        return count; 
    }
    public static void main(String[] args) {
        int n = 11;
        System.out.println(count(n));
    }
}
