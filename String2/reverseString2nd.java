public class reverseString2nd{
    public static String reverseWords(String s) {
        StringBuilder sb  = new StringBuilder();
        String str[] = s.split(" ");
        for(String s1 : str){
            StringBuilder sb1 = new StringBuilder(s1);
            sb1.reverse();
            sb.append(sb1).append(" ");
        }
        return sb.toString().trim();
    }
    public static void main(String[] args) {
        String str = "Let's take LeetCode contest";
        String res = reverseWords(str);
        System.out.println(res);

    } 
}