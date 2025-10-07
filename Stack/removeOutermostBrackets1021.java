import java.util.Stack;
import java.util.*;


public class removeOutermostBrackets1021 {
     public static String removeOuterParentheses(String s) {
        Stack<Character> st = new Stack<>();
        StringBuilder sb = new StringBuilder();

        for (char ch : s.toCharArray()) {
            if (ch == '(') {
                // If stack is not empty, it's not an outer '('
                if (!st.isEmpty()) sb.append(ch);
                st.push(ch);
            } else {
                st.pop();
                // If stack is not empty, it's not an outer ')'
                if (!st.isEmpty()) sb.append(ch);
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String res = removeOuterParentheses(str);
        System.out.println(res);
    }
}
