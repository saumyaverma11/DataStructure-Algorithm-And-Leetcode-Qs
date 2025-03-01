import java.util.*;
public class UniqueNumberofOccurenc1207{
  public static boolean uniqueFrequency(int[] nums) {
    ArrayList<Integer> list = new ArrayList<>();
    int n = nums.length;
    boolean visited[] = new boolean[n];
    for(int i=0;i<n;i++){
      if(visited[i]=true){
        continue;
      }
      int count =1;
      for(int j=i+1;j<n;j++){
        if(nums[i]==nums[j]){
          visited[j]=true;
          count++;
        }
      }
      if(list.contains(count)){
        return false;
      }
      list.add(count);
    }
    return true;
  }
  public static void main(String[] args) {
    int arr[]= {1,2,2,1,3};
    boolean res = uniqueFrequency(arr);
    System.out.println(res);
  }
}