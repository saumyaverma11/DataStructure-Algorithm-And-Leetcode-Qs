public class maxPosAndNeg2529 {


    //O(log n)

    public static int findFirstPositive(int[] nums) {
        int low = 0, high = nums.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (nums[mid] < 0) {
                low = mid + 1;
            } else {
                high = mid - 1; 
            }
        }
        return low; // First positive index = count of negative numbers
    }
    public static int findFirstNonZero(int[] nums) {
        int low = 0, high = nums.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (nums[mid] == 0) {
                low = mid + 1;
            } else if (nums[mid] > 0) {
                high = mid - 1; 
            } else {
                low = mid + 1;
            }
        }
        return low; // First non-zero index = start of positive numbers
    }
    public static int maxEfficient(int[] nums) {
        // O(logn)
        int n = nums.length;
        int negCount = findFirstPositive(nums); 
        int posCount = n - findFirstNonZero(nums); 
        return Math.max(negCount, posCount);

    }

    //O(n)

    public static int maxNaive(int[] nums) {
        int n = nums.length;
        int high = n-1;
        int mid =0;
        int pos=0,neg=0;
        while(mid<=high)
        {
            if(nums[mid]<0){
                neg++;
                mid++;
            }
            else if(nums[mid]==0){
                mid++;
            }
            else{
                pos++;
                high--;
            }
        }

        return Math.max(neg,pos);

    }
    public static void main(String[] args) {
        int nums[]= {-1,-3,-5,0,0,1,4,8};
        int res = maxNaive(nums);
        System.out.println(res);
        int res2 =  maxEfficient(nums);
        System.out.println(res2);
    }

}
