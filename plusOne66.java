import java.util.*;

class plusOne66{
    public static int[] plusOne(int[] digits) {
        int n = digits.length;
        for(int i=n-1;i>=0;i--){
            if(digits[i]<9){
                digits[i]=digits[i]+1;
                return digits;
            }
            digits[i]=0;
        }
        int [] newNum = new int[n+1];
        newNum[0]=1;

        return newNum;
    }
    public static void main(String args[]){
        int arr[]={9,9,9,9};
        System.out.println("Input: " + Arrays.toString(arr));
        System.out.println("Output: "+ Arrays.toString(plusOne(arr)));

        
    }
}
