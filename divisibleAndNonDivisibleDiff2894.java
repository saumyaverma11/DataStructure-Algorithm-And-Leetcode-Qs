public class divisibleAndNonDivisibleDiff2894 {
    public static int differenceOfSums(int n, int m) {
        int num1=0;
        int num2=0;
        for(int i =1;i<=n;i++){
            if(i%m!=0){
                num1 = num1 + i;
            }
        }
        for(int i=1;i<=n;i++){
            if(i%m==0){
                num2 = num2 + i;
            }
        }

        return num1-num2;
    }
    public static void main(String[] args) {
        int n =10, m=3;
        int res = differenceOfSums(n,m);
        System.out.println(res);
    }
}
