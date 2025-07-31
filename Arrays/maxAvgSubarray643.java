public class maxAvgSubarray643 {
      public  static double findMaxAverage(int[] nums, int k) {
        double maxAvg=  Integer.MIN_VALUE;
        double avg=0;
        double sum=0;
        int i;
        for(i=0;i<k;i++){
            sum= sum + nums[i];
        }
        avg= sum/k;
        maxAvg= Math.max(maxAvg, avg);
        for(int j=k;j<nums.length;j++){
            sum= sum - nums[j-k]  + nums[j];
            avg= sum/k;
            maxAvg= Math.max(maxAvg, avg);
        }
        return maxAvg;
    }
    public static void main(String[] args) {
        
    }
}
