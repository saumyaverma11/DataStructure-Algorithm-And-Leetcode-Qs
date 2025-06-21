// Both head and tail point to the same first node.

// Then, each time you do:

// tail.next = newNode;
// tail = tail.next;
// You're extending the chain starting from head.

// head still points to the first node, and from there you can traverse the full list using .next.

// head is never changed — it remains pointing to the beginning of the list.
// tail moves to the end and adds nodes, linking them via .next.


import java.util.*;

class Node{
    int val;
    Node next;
    Node(int val){
        this.val= val;
        this.next= null;
    }
}


public class oddEvenLinkedList328 {

     public static Node oddEvenList(Node head) {
        Node oddList = new Node(0);
        if(head== null){
            return null;
        }
        Node evenList = new Node(0);

        Node oddtail = oddList;
        Node eventail = evenList;

        Node temp = head;
        int count=1;
        while(temp!=null){
            if(count%2!=0){
                oddtail.next= temp;
                oddtail= oddtail.next;
            }
            else{
                eventail.next= temp;
                eventail= eventail.next;
            }
            temp= temp.next;
            count++;
        }
        
        eventail.next = null;          //terminate the even , meand found the end.
        oddtail.next = evenList.next;
        
        return oddList.next;
    }
    public static void main(String[] args) {
        // Example usage

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of nodes in the linked list:");
        int n = sc.nextInt();
        Node head= null;
        Node tail= null;
        for(int i=0;i<n;i++){
            Node newNode = new Node(sc.nextInt());
            if(head == null){
                head = tail = newNode;
            }
            else{
                tail.next = newNode;
                tail = tail.next;
            }
        }
        Node result = oddEvenList(head);
        System.out.println("Rearranged linked list:");
        while (result != null) {
            System.out.print(result.val + " ");
            result = result.next;
        }
    }
}
