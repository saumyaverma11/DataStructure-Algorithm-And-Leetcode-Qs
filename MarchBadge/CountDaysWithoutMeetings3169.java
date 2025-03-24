import java.util.Arrays;

    //very optimize during the array size is very large like 10^9  already
    // optimized solution (without large array) usme "Interval Merging" + "Greedy Technique" approach used


public class CountDaysWithoutMeetings3169{

    public static int countDaysEfficient(int days, int[][] meetings){
            if (meetings.length == 0) return days;

        // Sort meetings by start time
        Arrays.sort(meetings, (a, b) -> Integer.compare(a[0], b[0]));

        int freeDays = 0;
        int end = 0;

        for (int[] meeting : meetings) {
            int start = meeting[0];

            // Count the free days before the current meeting
            if (start > end + 1) {
                freeDays += (start - end - 1);
            }
            
            // Update the end of the merged range
            end = Math.max(end, meeting[1]);
        }

        // Count free days after the last meeting
        if (end < days) {
            freeDays += (days - end);
        }

        return freeDays;
    }

    //own but in n^2 , not optimized

    public static int countDaysNaive(int days, int[][] meetings) {
        int hash[] = new int[days+1];
        for(int i=0;i<meetings.length;i++){

            int start = meetings[i][0];
            int end = meetings[i][1];
            while(start<=end){
                hash[start]++;
                start++;
            }
        }

        int count =0;
        for(int i=1;i<=days;i++){
                if(hash[i]==0){
                    count++;
                }
        }
        return count;
    }
    public static void main(String[] args) {
        int days = 10;
        int meetings[][]= {
            {5,7},
            {1,3},
            {9,10},
        };
        int res = countDaysNaive(days,meetings);
        System.out.println(res);
        int res2 = countDaysEfficient(days,meetings);
        System.out.println(res2);
    }
}