import java.util.*;

public class containMostWater11 {
    public static int storeWaterBrute(ArrayList<Integer> height){


        //O(n^2)


        int max=Integer.MIN_VALUE;
        for(int i=0;i<height.size();i++){
            for(int j=i+1;j<height.size();j++){
                int width= j-i;
                int h= Math.min(height.get(i),height.get(j));
                int water= width*h;
                max = Math.max(water,max);
            }
        }
        return max;
    }
    public static int storeWaterefficient(ArrayList<Integer> height){
        int low=0;
        int high=height.size()-1;
        int max=Integer.MIN_VALUE;
        while(low<high){
            int width=high-low;
            int h= Math.min(height.get(low),height.get(high));
            int water = width*h;
            max=Math.max(water,max);
            if(height.get(low)<height.get(high)){
                low++;
            }
            else{
                high--;
            }
        }
        return max;
    }
    public static void main(String args[]){
        ArrayList<Integer> height = new ArrayList<>();
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);;
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);

        System.out.println(height);

        int water = storeWaterBrute(height);
        System.out.println("Water store :  " + water);

        int water2= storeWaterefficient(height);
        System.out.println("Water store :  " + water2);




    }
}
