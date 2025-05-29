import java.util.*;

class ListNode{
    int val;
    ListNode next;

    ListNode(int val){
        this.val = val;
    }
}

public class deleteTheMiddleNodeOdLinkedList2095 {


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

    public void display(){
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

    public void deleteMiddle(ListNode head) {
        int n =1;
        int half;
        ListNode temp = head;
        while(temp.next!=null){
            n++;
            temp = temp.next;
        }
        if(n== 1){
           System.out.println("null");
           return;
        }
        else{
        half = n/2;
        }

        ListNode temp2 = head;
        for(int i =0;i<half-1;i++){
            temp2 = temp2.next;
        }

        temp2.next = temp2.next.next;

        // return head;

    }

    public static void main(String[] args) {
        deleteTheMiddleNodeOdLinkedList2095 dl = new deleteTheMiddleNodeOdLinkedList2095();
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        dl.createList(size,sc);
        dl.display();
        dl.deleteMiddle(head);
        dl.display();



    }
}
