public class candy135 {

     public static int candy(int[] ratings) {
        int n = ratings.length;
        int [] candies = new int[n];

        for(int i=0; i<ratings.length;i++){
            candies[i] =1;
        }

        for(int i=1; i<ratings.length;i++){
            if(ratings[i]>ratings[i-1]){
                candies[i]= candies[i-1]+1;
            }
        }

        for(int i=n-2;i>=0;i--){
            if(ratings[i]>ratings[i+1]){
            candies[i] = Math.max( candies[i], candies[i+1] +1);
            }
        }

        int total=0;
        for(int candy : candies){
            total = total+ candy;
        }
        return total;
    }
    public static void main(String[] args) {
        int ratings[]= {1,0,2};
        int res = candy(ratings);
        System.out.println(res);
    }
}
