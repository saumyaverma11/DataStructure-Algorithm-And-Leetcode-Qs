public class new21Game837{
     public static double new21Game(int n, int k, int maxPts) {
        if (k == 0 || n >= k + maxPts) return 1.0;

        double[] dp = new double[n + 1];
        dp[0] = 1.0;

        double Wsum = 1.0, result = 0.0;

        for (int i = 1; i <= n; i++) {
            dp[i] = Wsum / maxPts;

            if (i < k) {
                Wsum += dp[i]; // still can draw
            } else {
                result += dp[i]; // game ends
            }

            if (i - maxPts >= 0) {
                Wsum -= dp[i - maxPts]; // sliding window
            }
        }

        return result;
    }
    public static void main(String[] args) {
        int n= 10;
        int k=1;
        int maxPts= 10;
        double vale = new21Game(n, k, maxPts);
        System.out.println(vale);
    }
}