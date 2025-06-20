public class mahathanDistance3443 {
    public static int maxDistance(String s, int k) {
       int totaldist=0;
       int n=0, so=0, e=0, w=0;
       for( char str : s.toCharArray()){
        switch(str){
            case 'N' : 
            n++;
            break;
            case 'S' : 
            so++;
            break;
            case 'W':
            w++;
            break;
            case 'E':
            e++;
            break;
        }


        // calculate vertical direction change time
        int times1 = Math.min(Math.min(n,so),k);
        //calculate horizontal direction change time
        int times2 = Math.min(Math.min(e,w),k-times1);
        totaldist = Math.max(totaldist, count(so,n,times1) + count(e,w,times2));
       }
       return totaldist;
    }

    public static int count(int dir1, int dir2 , int times){
        return Math.abs(dir1-dir2) + times*2;
    }
    public static void main(String[] args) {
        String s = "NSEW";
        int k = 2;
        System.out.println(maxDistance(s, k)); // Output: 4
    }
}
