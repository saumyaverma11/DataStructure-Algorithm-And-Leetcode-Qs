public class ContestTransformArrayToEqualElements1 {
    public static boolean canMakeEqual(int nums[], int k){
        if(canMakeAllTarget(nums.clone(),k,1)) return true;
                if(canMakeAllTarget(nums.clone(),k,-1)) return true;
        return false;
    }
    public static boolean canMakeAllTarget(int[] nums, int k, int Target) {


        //350 test case passed 

        
        // int comp = 0;
        // boolean flag= true;
        // for(int i=0;i<nums.length-1;i++){
        //     if(nums[i]== -1 && nums[i+1]==1 || nums[i]==-1 && nums[i+1]==-1){
        //         nums[i] *= -1;
        //         nums[i+1] *= -1;
        //         comp++;
        //     }
        //     flag = true;
        //     if(comp<=k){
        //     for(int j=0;j<nums.length-1;j++){
        //         if(nums[j]!=nums[j+1]){
        //             flag = false;
        //             continue;
        //         }
        //     }
        //     }
        //     else{
        //         break;
        //     }
        //     // if(comp == k){
        //     //     break;
        //     // }
        // }

        // // for(int i=0;i<nums.length;i++){
        // //     if(nums[i]==-1){
        // //         return false;
        // //     }
        // // }
        // // return true;
        // // if(flag== true) 
        // return flag;

        int comp=0;
        int n = nums.length;

        for(int i=0;i<n-1;i++){
            if(nums[i]!=Target){
                nums[i]=-nums[i];
                nums[i+1]= -nums[i+1];
                    comp++;
                if(comp>k) return false;
            }
        }

        for(int num:nums){
            if(num!= Target) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int nums[]={1,-1,1,-1,1};
        int k=3;
        boolean res= canMakeEqual(nums, k);
        System.out.println(res);
    }
}
