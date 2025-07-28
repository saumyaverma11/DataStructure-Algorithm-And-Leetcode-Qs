public class addString415{
        public static String addStrings(String num1, String num2) {

     StringBuilder result = new StringBuilder();

        int i = num1.length() - 1;
        int j = num2.length() - 1;
        int carry = 0;

        while (i >= 0 || j >= 0 || carry > 0) {
            int digit1 = (i >= 0) ? num1.charAt(i--) - '0' : 0;
            int digit2 = (j >= 0) ? num2.charAt(j--) - '0' : 0;

            int sum = digit1 + digit2 + carry;
            result.append(sum % 10);       // add the last digit
            carry = sum / 10;              // keep the carry
        }

        return result.reverse().toString();  // reverse at the end

   }
    public static void main(String[] args) {
        String a = "12";
        String b= "123";
        String res = addStrings(a, b);
        System.out.println(res);
    }
}