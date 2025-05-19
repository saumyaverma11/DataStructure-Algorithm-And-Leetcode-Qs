import java.util.*;

public class BaseballGame682 {
    public static int calPoints(String[] operations) {
        int[] record = new int[operations.length];
        int index = 0;

        for (String op : operations) {
            if (op.equals("C")) {
                index--;
            } else if (op.equals("D")) {
                record[index] = 2 * record[index - 1];
                index++;
            } else if (op.equals("+")) {
                record[index] = record[index - 1] + record[index - 2];
                index++;
            } else {
                record[index] = Integer.parseInt(op);
                index++;
            }
        }

        int sum = 0;
        for (int i = 0; i < index; i++) {
            sum += record[i];
        }

        return sum;
    }

    public static void main(String[] args) {
        String[] ops = {"5", "2", "C", "D", "+"};
        int result = calPoints(ops);
        System.out.println("Total Score: " + result);  // Output: 30
    }
}
