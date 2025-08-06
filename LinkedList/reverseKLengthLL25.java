import java.util.*;


    class ListNode{
        int data;
        ListNode next;
        ListNode(int data){
            this.data= data;
            this.next = null;
        }
    }

public class reverseKLengthLL25 {
     public static ListNode reverseKGroup(ListNode head, int k) {

        ListNode temp = head;
        int count=0;
        while(temp!= null && count<k){   // want to check that remaining length is equal or not equal to ll length
            temp= temp.next;
            count++;
        }
        if(count<k){   // if we don't have 3 or more than 3 nodes then return it same as!
            return head;
        }
       ListNode curr = head;  // reverse k length ll
       ListNode prev= null;
       count=0;
       ListNode next=null;
       while(curr!= null && count<k){
        next = curr.next;
        curr.next= prev;
        prev= curr;
        curr=next;
        count++;
       } 


       if(next!=null){
        head.next= reverseKGroup(next,k);             //head is now the last node of the reversed group.
       // You must link it to the next reversed group (which reverseKGroup(next, k) returns).


       }

       return prev;

       //After reversing, prev is the new head of this k-group.
        //So we return prev.
    }
    

    public static ListNode createList(ListNode head ,Scanner sc){
        int data = sc.nextInt();
        ListNode newNode= new ListNode(data);
        if(head == null){
            return newNode;
        }
        ListNode temp  = head;
        while(temp.next!=null){
            temp = temp.next;
        }
        temp.next = newNode;
        return head;

    }
    public static void printList( ListNode head){
        if(head == null){
            System.out.print("null list ");
            return;
        }
        ListNode temp= head;
        while(temp!=null){
            System.out.print(temp.data +" ");
            temp= temp.next;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        ListNode newList = null;
        for(int i=0;i<n;i++){
           newList = createList (newList, sc );
        }

        int k = sc.nextInt();
        newList = reverseKGroup(newList, k);
        printList(newList);

    }
}
