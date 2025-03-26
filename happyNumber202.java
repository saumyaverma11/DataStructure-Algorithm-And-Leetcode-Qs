public class happyNumber202{
    public static boolean isHappy(int n) {
        if(n<0){
            return false;
        }
        if(n==1){
            return true;
        }
        int sum;
        int num;
        while(n>1){
            num=n;
            sum=0;
            while(num>0){
                int rem = num%10;
                sum= sum + (rem*rem);
                num = num/10;
            }
          
         if (sum==1 || sum==7){
            return true;
         }
         else if(sum<10){
            return false;
         }
         else{
            n=sum;
         }
        }
        return false;

    }
    public static void main(String[] args) {
        int num =  19;
        boolean bol = isHappy(num);
        System.out.println(bol);
    }
}