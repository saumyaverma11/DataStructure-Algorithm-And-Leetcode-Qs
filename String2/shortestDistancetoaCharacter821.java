import java.util.*;
public class shortestDistancetoaCharacter821 {
     public static int[] shortestToChar(String s, char c) {
        int n = s.length();
        int[] res = new int[n];
        int prev = Integer.MIN_VALUE / 2; // to avoid overflow on subtraction

        // Left to Right pass
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == c) prev = i;
            res[i] = i - prev;
        }

        // Right to Left pass
        prev = Integer.MAX_VALUE / 2;
        for (int i = n - 1; i >= 0; i--) {
            if (s.charAt(i) == c) prev = i;
            res[i] = Math.min(res[i], prev - i);
        }

        return res;
    }

    public static void main(String[] args) {
        String s = "loveleetcode";
        char c = 'e';
        System.out.println(Arrays.toString(shortestToChar(s, c)));
    }
}
