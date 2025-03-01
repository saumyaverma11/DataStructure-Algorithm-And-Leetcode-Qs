
import java.util.*;
public class consecutiveNumberSum829 {


                   //   //n^2 complexity    (brute force )


    public static int sumNaive(int n){
        if(n==1 || n==0){
            return n;
        }
        if(n==2){
            return 1;
        }
        int sum=0;
        int count=0;
        for(int i=n/2+1;i>0;i--){
            sum=0;
            int low=i-1;
            sum=sum+i;
           
            while(sum<n){
                sum= sum+low;
                low--;
            }
             if(sum==n){
                count++;
            }
           

        }
        return count+1;
    }
                                  // o(Rude n) complexity     best  (Mathematical function)

    public static int sumEfficient(int n){
            int count = 0;
            for(int i = 1; i * i < 2 * n;i ++){
                if((n - i * (i - 1)/2) % i == 0){
                    count++;
                }
            }
            return count;
    
    }


                        //o(n) time compleity better   (uusing two pointer and sliding window technique)


    public static int sumbetter(int n){
        int count =0;
        int sum=0;
        int left =1;
        int right =1;
        while(right<=n){
            sum = sum +right;
            // if(sum<n){                  //not works here properly lesss than n<5 elements
            //     right++;
            // }
            while(sum>n){
                sum= sum - left;
                left++;
            }
            if(sum==n){
                count++;
            }
            right++;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result = sumNaive(n);
        System.out.println(result);



        int res = sumEfficient(n);
        System.out.println(res);


        int ress = sumbetter(n);
        System.out.println(ress);

    }
}
