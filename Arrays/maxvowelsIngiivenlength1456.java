public class maxvowelsIngiivenlength1456 {
     public static boolean isVowel(char ch){
         if(ch == 'a' || ch=='e' || ch == 'i' || ch =='o' || ch =='u'){
           return true;
         }
         return false; 
    }

    public static int maxVowels(String s, int k) {
        int maxCount=Integer.MIN_VALUE;
        if(maxCount == k)    //for check if the maxcount is equal to k then return it , there is not need go check further.
        return maxCount;
        int count=0;
        for(int i=0;i<k;i++){
            if(isVowel(s.charAt(i))){
                count++;
            }
        }
            
        maxCount= Math.max(maxCount, count);
        for(int j=k;j<s.length();j++){
             if(isVowel(s.charAt(j-k))){
                count--;
            }
            if(isVowel(s.charAt(j))){
                count++;
            }

            maxCount= Math.max(maxCount,count);
        }

        return maxCount;
    }
    public static void main(String[] args) {
        String s = "abciiidef";
        int k=3;
        int res =  maxVowels(s,k);
        System.out.println(res);
    }
}
