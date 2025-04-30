public class sumOfTwoNumber371 {
    public static int getSum(int a, int b) {
        while(b!=0){
            int carry = (a&b);        
            a= a^b;
            b= carry<<1;
        }
        return a;
    }
    public static void main(String[] args) {
        int a =1, b=2;
        int res = getSum(a,b);
        System.out.println(res);
    }
}
