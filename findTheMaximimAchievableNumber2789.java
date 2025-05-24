public class findTheMaximimAchievableNumber2789 {
     public static int theMaximumAchievableX(int num, int t)
     {
       return num+2*t;
    }
    public static void main(String[] args) {
        int num = 4, t =1;
        int res =  theMaximumAchievableX(num, t);
        System.out.println(res);
    }
}
