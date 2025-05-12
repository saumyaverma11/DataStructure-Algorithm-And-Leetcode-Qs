public class removeElement27{
     public static int removeElementMoreSpace(int[] nums, int val) {
        int hash[]= new int[nums.length];
        int idx=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==val){
                continue;
            }
            else{
                hash[idx]= nums[i];
                idx++;
            }
        }
       
        return idx;
    }

    public static int removeElementWithoutSpace(int[] nums, int val) {
         int idx=0;
         for(int i =0;i<nums.length;i++)
         {
            if(nums[i]!=val){
                nums[idx] = nums[i];
                idx++;
            }
         }
         return idx;
    }
public static void main(String[] args) {
    int arr[]={3,2,2,3};
    int val=3;
    System.out.println(removeElementMoreSpace(arr,val));
    System.out.println(removeElementWithoutSpace(arr,val));
}}