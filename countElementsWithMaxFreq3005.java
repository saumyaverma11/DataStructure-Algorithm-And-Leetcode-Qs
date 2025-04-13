public class countElementsWithMaxFreq3005 {

    public static int freq(int nums[]){
        int n = nums.length;
        int hash[]=new int[101];
        for(int i=0;i<nums.length;i++){
            hash[nums[i]]++;
        }
        int max= Integer.MIN_VALUE;
        for(int i =0;i<hash.length;i++){
            max= Math.max(max,hash[i]);
        }
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(hash[nums[i]]== max){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int nums[]={1,2,2,3,1,4};
        int res = freq(nums);
        System.out.println(res);
    }
}
