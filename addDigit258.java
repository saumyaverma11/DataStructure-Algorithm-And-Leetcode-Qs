import java.util.*;

public class addDigit258 {
    public static int addNaive(int num){
        int sum =num;
        while(sum>=10){
            int tempSum= 0;
            while(sum>0){
                tempSum = tempSum + sum%10;
                sum=sum/10;
            }
            sum=tempSum;
        }
        return sum;
    }
    public static int addEfficient(int num){
        if(num==0){
            return 0;
        }
        else{
            return 1+(num-1)%9;
        }

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num = sc.nextInt();
        int res = addNaive(num);
        int res2= addEfficient(num);
        System.out.println("Naive approach: "+res +"\n" + "Efficient Approach: "+ res2);
    }
}
