import java.lang.reflect.Array;

import java.util.*;
public class defuseTheBomb1652 {
    public  static int[] decrypt(int[] code, int k) {
        int arr[] = new int[code.length];
        if(k==0) return arr;
        for(int i=0;i<code.length;i++){
            int sum;
            if(k>0){
                sum=0;
                for(int  j=1;j<=k;j++){
                    sum = sum + code[(i+j) %code.length];
                }
            }
            else{
                sum=0;
                for(int j=1;j<=-k;j++){
                    sum= sum + code[(i-j+code.length)%code.length];
                }
            }
            arr[i]= sum;

        }
        return arr;
    }
    public static void main(String[] args) {
        int code[]= {5,7,1,4};
        int k=3;
        int res[] = decrypt(code,k);
        System.out.println(Arrays.toString(res));
    }
}
