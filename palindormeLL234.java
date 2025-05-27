    import java.util.*;

class Node{
    int val;
    Node next;
    
    Node(int val){
        this.val  = val;
    }
}


public class palindormeLL234 {
     static Node head = null;

    public void createList(int size, Scanner sc){
        for(int i=0;i<size;i++){
            System.out.print("Enter value in linkedlist ");
            int val = sc.nextInt();
            makenode(val);
        }
    }

    public void makenode( int val){
        Node newNode = new Node(val);

        if(head == null){
            head = newNode;
            return;
        }
        Node temp = head;
        while(temp.next!=null){
            temp= temp.next;
        }
        temp.next = newNode;
    }


    public Node palindrome(Node head){
        Node slow = head;
        Node fast = head;

        while(fast!=null && fast.next!=null){
            slow= slow.next;
            fast =fast.next.next;
        }

        return slow;
    }
  


    public boolean checkPalindrome(){
        //step 1 to find mid 

        if(head == null|| head.next == null ){
            return true;
        }
        Node mid = palindrome(head);


        // step 2 Reverse 2nd half

        Node prev = null;
        Node curr = mid;
        Node next;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev= curr;
            curr= next;
        }

        Node rightHead = prev;
        Node leftHead = head;

        //step 3 check left half and right half


        while(rightHead!=null){
            if(leftHead.val != rightHead.val){
                return false;
            }
            leftHead= leftHead.next;
            rightHead = rightHead.next;
        }
        return true;
    }
    public void display(){
        Node temp = head;
        if(head == null){
            System.out.println("list is empty");
            return;
        }
        while(temp!= null){
            System.out.print(temp.val+" ");
            temp= temp.next;
        }
        System.out.println();
    }


    public static void main(String[] args) {
        palindormeLL234 ch = new palindormeLL234();
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size");
        int size = sc.nextInt();

        ch.createList (size,sc);
        ch.display();
        // ch.reverse(head);
        // Node res = ch.palindrome(head);
        // System.out.println(res.val);
        
        boolean res = ch.checkPalindrome();
        System.out.println(res);
    }
}
