public class typeOfTraingle3024{
   
        public static String triangleType(int[] nums) {
            if((nums[0] + nums[1] <= nums[2] ) ||
              (nums[0] + nums[2] <= nums[1] ) || 
              ( nums[1] + nums[2] <= nums[0]))
            {
                return "none";
            }
            if(nums[0]== nums[1] && nums[1] == nums[2]){
                return "equilateral";
            }
            else if(nums[0] == nums[1] || nums[1] == nums[2] || nums[0] == nums[2])
            {
                return "isosceles";
            }
            
            else {
                return "scalene";
            }
        }
    
    public static void main(String[] args) {
        int arr[] ={3,3,3};
        String str = triangleType(arr);
        System.out.println(str);
    }
}