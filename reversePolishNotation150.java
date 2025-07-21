import java.util.*;
public class reversePolishNotation150{
    public static int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        String Operators = "+-*/";
        for(String t : tokens){
            if(!Operators.contains(t)){
               stack.push(Integer.valueOf(t));
            }
            else{
                int a = stack.pop();
                int b= stack.pop();
                switch(t){
                    case "+" :
                    stack.push(b+a);
                    break;
                    case "-" :
                    stack.push(b-a);
                    break;
                    case "*" :
                    stack.push(b*a);
                    break;
                    case "/" :
                    stack.push(b/a);
                    break;
                }


            }
        }
        return stack.pop();
    }

    public static void main(String[] args) {
        String tokens[] = {"2","1","+","3","*"};
        int res  = evalRPN(tokens);
        System.out.println(res);
    }
}