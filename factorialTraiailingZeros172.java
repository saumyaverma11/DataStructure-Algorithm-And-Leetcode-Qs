public class factorialTraiailingZeros172 {
    public static int trailingZeroes(int n) {
        int count=0;
        while(n>0){
            n= n/5;
            count +=n;
        }
            return count;

    }
    public static void main(String[] args) {
        int n=5;
        int res = trailingZeroes(n);
        System.out.println(res);
    }
}
