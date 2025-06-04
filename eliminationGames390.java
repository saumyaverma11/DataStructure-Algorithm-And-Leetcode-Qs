
import java.util.*;

public class eliminationGames390 {

    public static int lastRemaining(int n) {
        int head = 1;
        int step = 1;
        boolean leftToRight = true;

        while (n > 1) {
            // always update head when eliminating from left or n is odd
            if (leftToRight || n % 2 == 1) {
                head += step;
            }
            n = n / 2;
            step *= 2;
            leftToRight = !leftToRight;
        }

        return head;
    }
    public static void main(String[] args) {
        int n =9;
        int res  = lastRemaining(n);
        System.out.println(res);
    }
}
