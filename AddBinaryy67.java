import java.util.Scanner;

public class AddBinaryy67 {
    
    public static String addLargeNumber(String a, String b){
        int result =0; 
        int n1;
        int n2;
        for(int i=0;i<a.length();i++){
            int bit = a.charAt(i) -'0';
            result = result * 2 + bit;
        }
        n1=result; 
        int result2 =0;
        for(int i =0;i<b.length();i++){
            int bit = b.charAt(i) -'0';
            result2 = result2 * 2 + bit;
        }
        n2=result2;
        int num = n1+n2;
        return Integer.toBinaryString(num);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        String a= sc.nextLine();
        String b= sc.nextLine();
        // String result = addBinary(a, b);

        // System.out.println(result);
        String Large = addLargeNumber(a,b);
        System.out.println(Large);
    }
}
