import java.util.Scanner;

public class swapNodesInPair24 {
     public static ListNode swapPairs(ListNode head) {
        int k=2;
        int count=0;
        ListNode curr= head;
        ListNode next=null;
        ListNode prev= null;
        while(curr!=null && count<2){
            next= curr.next;
            curr.next= prev;
            prev= curr;
            curr= next;
            count++;
        }
        if(next!=null){
            head.next = swapPairs(next);
        }
        return prev;
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
        newList = swapPairs(newList);
        printList(newList);

    }
}
