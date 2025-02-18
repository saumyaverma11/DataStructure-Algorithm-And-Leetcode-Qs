import java.util.*;
import java.math.BigInteger;

public class addBinary67 {
    public static String addBinary(String a, String b) {
        int num1= Integer.parseInt(a,2);
        int num2= Integer.parseInt(b,2);
        System.out.println(num1 +"," + num2);
        int sum = num1+num2;
        String binary  = Integer.toBinaryString(sum);
        return binary;

    }

    public static String addLargeNumber(String a, String b) {
        BigInteger num1 = new BigInteger(a,2);
        BigInteger num2 = new BigInteger(b,2);
        BigInteger sum= num1.add(num2);
        String binary = sum.toString(2);
        return binary;
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
