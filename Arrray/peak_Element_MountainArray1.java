import java.util.*;

public class peak_Element_MountainArray1 {
        public static int peakIndexInMountainArray(int arr[]) {
            int i=0;
            while(arr[i]<arr[i+1]){
                i++;
            }
            return i;
        }

        public static void main(String args[]){
            int [] arr = {0, 10, 5, 2};
            int index = peakIndexInMountainArray(arr);
            System.out.println("Peak element index is: "+  index);
        }
    
}




