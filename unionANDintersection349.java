import java.util.*;

public class unionANDintersection349 {
    public static void unionandIntersection(int nums1[], int nums2[])
{
    HashSet<Integer> set = new HashSet<>();
    int c1= 0;
    for(int i =0;i<nums1.length;i++){
        
        if(set.add(nums1[i])){
            c1++;
        };
    }
    
    for(int i =0;i<nums2.length;i++){
        
        if(set.add(nums2[i])){
            c1++;
        };
    }
    System.out.println(set + "and count of union is : " + c1);

        set.clear();

        HashSet<Integer> set2 = new HashSet<>();
        int c2=0;
        for(int i =0;i<nums1.length;i++){
            set.add(nums1[i]);
        }

        for(int i =0;i<nums2.length;i++){
            if(set.contains(nums2[i])){
    
                if(set2.add(nums2[i])){
                    c2++;
                };
            }
        }
    
    System.out.println(set2 +" and count of intersection is :" + c2);
}
        public static void main(String[] args) {
            // int arr1[]={7,3,9};
            // int arr2[]={6,3,9,2,9,4};
            int arr1[]={1,2,2,1};
            int arr2[]={2,2};

            unionandIntersection(arr1,arr2);

        }
    

}
