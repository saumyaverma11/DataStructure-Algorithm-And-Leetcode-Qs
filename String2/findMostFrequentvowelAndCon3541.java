
public class findMostFrequentvowelAndCon3541 {
     public static int maxFreqSum(String s) {
        int vow[]= new int[256];
        int con[]= new int[256];
        int maxVows = 0;
        int maxCons = 0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='a'|| s.charAt(i)=='e' || s.charAt(i)=='i'|| s.charAt(i)=='o' || s.charAt(i)=='u')
            {
                vow[s.charAt(i)]++;
            }
            else{
                con[s.charAt(i)]++;
            }
        }


        for(int i=0;i<vow.length;i++){
            maxVows= Math.max(maxVows,vow[i]);
        }
        for(int i=0;i<con.length;i++){
            maxCons= Math.max(maxCons,con[i]);
        }
        return maxVows + maxCons;

    }
    public static void main(String[] args) {
        String str ="successes";
        System.out.println(maxFreqSum(str));
    }
}
