public class FirstUniqueCharInAString387 {
    public static int firstUniqChar(String s) {
        int n = s.length();
        int hash[]= new int[256];            //we can create hash array also in size of  int hash[] = new int[26];
        for(int i=0;i<n;i++){
            hash[s.charAt(i)]++;            //then we use here hash[s.charAt(i)-97]++

        }
        for(int i=0;i<n;i++){
            if(hash[s.charAt(i)] == 1){          //then we use here hash[s.charAt(i)-97] ==1
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        String s = "leetcode";
        int res =  firstUniqChar(s);
        System.out.println(res);
    }

}
