public class rotateString796 {
    public static boolean rotateSearch(String s, String goal) {
        if(s.length()!=goal.length()){
            return false;
        }

        return (s+s).contains(goal);
    }
    public static void main(String[] args) {
        String s= "abcde";
        String goal="cdeab";
        boolean res =rotateSearch(s,goal);
        System.out.println(res);
    }
}
