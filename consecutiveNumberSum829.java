
import java.util.*;
public class consecutiveNumberSum829 {
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

    public static int sumEfficient(int n){
            int count = 0;
            for(int i = 1; i * i < 2 * n;i ++){
                if((n - i * (i - 1)/2) % i == 0){
                    count++;
                }
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

    }
}
