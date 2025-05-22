import java.util.*;

class ListNode{
    int val;
    ListNode next;

    ListNode(int val){
        this.val = val;
    }

}

public class reverseLinkedList2nd92 {
    
    static public ListNode head = null;


    public void createList(int size, Scanner sc ){
        for(int  i=0;i<size;i++){
            int val = sc.nextInt();
            makenode(val);
        }


    }

    public void makenode(int val){
        ListNode newNode = new ListNode(val);
        if(head == null){
            head = newNode;
            return;
        }
        //addLast 
        ListNode temp = head;
        while(temp.next!=null){
            temp= temp.next;
        }
        temp.next = newNode;
        
    }

    public ListNode reverseBetween(ListNode head, int left, int right) {

        if(head == null || left == right ){
            return head;
        }

        ListNode dummy= new ListNode(0);
        dummy.next = head;
        ListNode prev = dummy;


        for(int i=1;i<left;i++){
            prev = prev.next;      //prev reach before one node of left
        }

        ListNode curr = prev.next;           //curr initalizes with thw point form where reverse start.
        ListNode next = null;          //use as a temp node 


        for(int i =0;i<right-left;i++){
            next = curr.next;
            curr.next = next.next;
            next.next = prev.next;
            prev.next = next;
        }
        return dummy.next;
    }

    public void display(){
        ListNode temp = head;
        while(temp!=null){
            System.out.print(temp.val+ " ");
            temp= temp.next;
        }
    }
    public static void main(String[] args) {
        reverseLinkedList2nd92 rll = new reverseLinkedList2nd92();
        Scanner sc= new Scanner(System.in);
        int size= sc.nextInt();
        rll.createList(size,sc);
        rll.display();
        int left = sc.nextInt();
        int right = sc.nextInt();
        rll.reverseBetween(head, left, right);
        rll.display();


    }
}
