public class permutationInString567 {
        public static boolean ISCompare(int hash[], int hash2[]){
            for(int i=0;i<hash.length;i++){
                if(hash[i]!=hash2[i]){
                    return false;
                }
            }
            return true;
        }
        public static boolean checkInclusion(String s1, String s2) {
            if(s1.length()>s2.length()){
                return false;
            }
            int hash[]= new int[256];
            int hash2[]= new int[256];
            for(int i=0;i<s1.length();i++){
                hash[s1.charAt(i)]++;
                hash2[s2.charAt(i)]++;
            }
    
            for(int i=s1.length();i<s2.length();i++){
                if(ISCompare(hash,hash2)){
                    return true;
                }
                hash2[s2.charAt(i)]++;
                hash2[s2.charAt(i-s1.length())]--;
    
            }
            if(ISCompare(hash,hash2)){
                return true;
            }
            return false;
        }
    public static void main(String[] args) {
        String s1 = "ab";
        String s2 = "eidbaooo";
        boolean res =checkInclusion(s1,s2);
        System.out.println(res);
    }
}
