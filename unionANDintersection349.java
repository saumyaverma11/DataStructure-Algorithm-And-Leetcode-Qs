import java.util.*;

public class unionANDintersection349 {
    public static void unionandIntersection(int nums1[], int nums2[])
{
    HashSet<Integer> set = new HashSet<>();
    for(int i =0;i<nums1.length;i++){
        set.add(nums1[i]);
    }
    for(int i =0;i<nums2.length;i++){
        set.add(nums2[i]);
    }
    System.out.println(set);

        set.clear();

    for(int i =0;i<nums1.length;i++){
        set.add(nums1[i]);
    }

    for(int i =0;i<nums2.length;i++){
        if(!set.contains(nums2[i])){
            set.remove(nums2[i]);
        }
    }
    System.out.println(set);
}
        public static void main(String[] args) {
            // int arr1[]={7,3,9};
            // int arr2[]={6,3,9,2,9,4};
            int arr1[]={1,2,2,1};
            int arr2[]={2,2};

            unionandIntersection(arr1,arr2);

        }
    

}
