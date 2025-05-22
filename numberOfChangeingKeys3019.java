public class numberOfChangeingKeys3019 
{

    public static  int countKeyChanges(String s) {
        int count = 0 ; 
        for(int i =0;i<s.length()-1;i++){
            if(((s.charAt(i) == (s.charAt(i+1))) || (s.charAt(i) == (s.charAt(i+1) + 32))) || ((s.charAt(i) == (s.charAt(i+1))) || (s.charAt(i) == (s.charAt(i+1) - 32)))){
                count = count;
            }
            else{
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        String s = "aAbBcC";
        int res =countKeyChanges(s);
        System.out.println(res);
    }
}
