class thirdMaxNumber414 {
    public static int thirdMax(int[] nums) {
        // HashSet<Integer> set  = new HashSet<>();
        // for(int i =0;i<nums.length;i++){
        //     set.add(nums[i]);
        // }
        // int n = set.size();

        // //we use iterator for traversing on set;

        // ArrayList<Integer> list = new ArrayList<>(set);


        // Collections.sort(list, Collections.reverseOrder());
        
        // if(set.size()>=3){
        //     return list.get(2);
        // }
        // else{
        //     return list.get(0);
        // }

        long min = Long.MIN_VALUE;

        long first = Long.MIN_VALUE;
        long second = Long.MIN_VALUE;
        long third= Long.MIN_VALUE;

        for(int i =0;i<nums.length;i++){
            if(first<nums[i]){
                third = second;
                second= first;
                first= nums[i];
            }

            else if(second < nums[i] && first != nums[i]){
                third = second;
                second = nums[i];
            }
            else if(third < nums[i] && first != nums[i] && second!= nums[i]){
                third= nums[i];
            }


        }

        if(third == min){
            return (int) first;
        }
        else if(nums.length==2)
        {
            return (int) second;
        }
        else{
            return (int) third;
        }
    }
}