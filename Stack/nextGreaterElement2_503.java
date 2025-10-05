 import java.util.*;
    import java.util.Stack;
   
public class nextGreaterElement2_503 {
   
    
      public static int[] nextGreaterElements(int[] nums) {
            int arr[]= new int[nums.length];
            Stack<Integer> st = new Stack<>();
            int n= nums.length;
            for(int i=2*n-1;i>=0;i--){
                while(!st.isEmpty() && (nums[st.peek()] <= nums[i%n])){
                    st.pop();
                }
                arr[i%n] = st.isEmpty()? -1 : nums[st.peek()];
                st.push(i%n);
            }
            return arr;
        }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n= sc.nextInt();
            int arr[]= new int[n];
            for(int i=0;i<n;i++){
                arr[i]= sc.nextInt();
            }
    
            int[] res = nextGreaterElements(arr);
            System.out.println(Arrays.toString(res));
    
        }

    

}