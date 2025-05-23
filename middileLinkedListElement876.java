import java.util.*;

class ListNode{
    int val;
    ListNode next;

    ListNode(int val){
        this.val = val;
    }
}

public class middileLinkedListElement876 {
    
    
    static ListNode head = null;

    public void createList(int size, Scanner sc ){
        for(int i=0;i<size;i++){
            int val = sc.nextInt();
            makeNode(val);
        }
    }

    public void makeNode(int val){
        ListNode newNode = new ListNode(val);
        if(head == null){
            head = newNode;
            return;
        }
        else{
            ListNode temp = head;
            while(temp.next!=null){
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    public void display(ListNode head){
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        else{
            ListNode temp = head;
            while(temp!=null){
                System.out.print(temp.val+" ");
                temp= temp.next;
            }
        }
        System.out.println();
    }
      public static ListNode middleNode(ListNode head) {
        int n=1;
        ListNode temp = head;
        while(temp.next!=null){
            n++;
            temp=temp.next;
        }
        // if(n)
        int half  = n/2;
        ListNode temp2 = head;
        for(int i=0;i<half;i++){
            temp2= temp2.next;
        }

        return temp2;



    }

     public static void main(String[] args) {
        middileLinkedListElement876 dl = new middileLinkedListElement876();
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        dl.createList(size,sc);
        ListNode temp = dl.middleNode(head);
        dl.display(temp);



    }
}
