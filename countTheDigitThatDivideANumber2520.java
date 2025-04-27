public class countTheDigitThatDivideANumber2520 {
    public static int countDigits(int num) {
        int n = num;
        int count=0;
        while(num>0){
            int r = num %10;
            if(n%r ==0){
                count++;
            }
            num = num/10;
        }   
        return count;
    }

    public static void main(String[] args) {
        int num = 7;
        int res =countDigits(num);
        System.out.println(res);
    }
}
