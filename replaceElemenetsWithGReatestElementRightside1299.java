import java.util.Arrays;

public class replaceElemenetsWithGReatestElementRightside1299{
    

   public static int[] replaceElements(int[] arr) {

        //O(n3)


        // int temp[]= new int[arr.length];
        // for(int i=0;i<arr.length;i++){
        //     int num = arr[i];
        //     int max= Integer.MIN_VALUE;
        //     for(int j=i+1;j<arr.length;j++){
        //         max=Math.max(max,arr[j]);
        //     }
        //     temp[i]= max;
        // }
        // temp[arr.length-1]= -1;
        // return temp;


        //O(n2)

        int temp[]= new int[arr.length];
        int max = -1;
        for(int i=arr.length-1;i>=0;i--){
            temp[i]= max;

            //where arr[i] is right largest value 
            if(arr[i]>max){
                max= arr[i];
            }
        }

        return temp;

    } 
    
    public static void main(String[] args) {
        int arr[]= {17,18,5,4,6,1};
        int nums[]= replaceElements(arr);
        System.out.println(Arrays.toString(nums));
    }
}