import java.util.*;

public class studentHaveLunch1700 {
    public int countStudents(int[] students, int[] sandwiches) {
        Queue<Integer> q = new LinkedList<>();
        Stack<Integer> st = new Stack<>();
        for(int i=sandwiches.length-1;i>=0;i--){
            st.push(sandwiches[i]);
        }

        for(int stud : students){
            q.offer(stud);
        }

        int count =0;  //rotation counter 

        while(!q.isEmpty() && !st.isEmpty()){
            if(q.peek() == st.peek()){
                q.poll(); // remove element 
                st.pop(); // remove sandwich
                count =0;  // reset rotation 
            }else{
                q.offer(q.poll());
                count++;
            }
          //  “If every student in the queue has refused the top sandwich in a row, then no one wants this sandwich → stop the process.”
            if(count == q.size()) break;
        } 
        return count;

    }
    public static void main(String[] args) {
        
    }
}
