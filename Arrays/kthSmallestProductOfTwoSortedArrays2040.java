import java.util.*;

public class kthSmallestProductOfTwoSortedArrays2040 {

     public static long kthSmallestProduct(int[] nums1, int[] nums2, long k) {
        ArrayList<Long> list = new ArrayList<>();

        for(int i=0;i<nums1.length;i++){
            for(int j=0;j<nums2.length;j++){
                long num= 1L * nums1[i]* nums2[j];
                list.add(num);
            }
        }

        Collections.sort(list);
        return list.get((int)(k-1));
    }


    public static long kthSmallestProductEfficient(int[] nums1, int[] nums2, long k) {
        long left = -10000000000L;
        long right = 10000000000L;

        while (left < right) {
            long mid = left + (right - left) / 2;

            if (countLessEqual(nums1, nums2, mid) >= k) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }

        return left;
    }

    private static long countLessEqual(int[] nums1, int[] nums2, long target) {
        long count = 0;
        for (int num : nums1) {
            if (num > 0) {
                count += countPositive(num, nums2, target);
            } else if (num < 0) {
                count += countNegative(num, nums2, target);
            } else {
                if (target >= 0) count += nums2.length;
            }
        }
        return count;
    }

    private static int countPositive(int num, int[] nums, long target) {
        int low = 0, high = nums.length - 1, res = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (1L * num * nums[mid] <= target) {
                res = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return res + 1;
    }

    private static int countNegative(int num, int[] nums, long target) {
        int low = 0, high = nums.length - 1, res = nums.length;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (1L * num * nums[mid] <= target) {
                res = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return nums.length - res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int m= sc.nextInt();
        int nums1[]= new int[n];
        int nums2[]= new int[n];
        for(int i=0;i<nums1.length;i++){
            nums1[i]= sc.nextInt();
        }
          for(int i=0;i<nums2.length;i++){
            nums2[i]= sc.nextInt();
        }

        int k = sc.nextInt();
        long res=kthSmallestProduct(nums1,nums2,k);
        System.out.println(res);
        long res2 =kthSmallestProductEfficient(nums1,nums2,k);
        System.out.println(res2);

    }
}

