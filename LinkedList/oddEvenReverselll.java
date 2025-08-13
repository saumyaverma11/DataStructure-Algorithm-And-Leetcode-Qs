import java.util.*;;
class Node{
    int val;
    Node next;
    Node(int val){
        this.val= val;
        this.next= null;
    }
}



public class oddEvenReverselll {
    public static Node oddEvenReverse(Node head){
        if(head== null) return null;

        Node oddList = new Node(0);
        Node evenList = new Node(0);

        Node oddTail = oddList;
        Node evenTail= evenList;
        Node temp = head;
        while(temp!=null){
            if(temp.val %2 == 0){
                evenTail.next = temp;
                evenTail= evenTail.next;
            }
            else{

                oddTail.next = temp;
                oddTail = oddTail.next;
            }
            temp= temp.next;
        }

        //reverse  
         
        evenTail.next = null;
        oddTail.next = evenList.next; // link the even list to the end of odd list
        Node newNode = oddList.next; // start from the first even node
        Node prev= null;
        Node curr= newNode;
        Node next = null;
        while(curr!=null){
            next = curr.next;
            curr.next= prev;
            prev = curr;
            curr= next;
        }

        return prev;
        // evenList.next = prev; // link the odd list to the reversed even list
        // return evenList.next; // return the new head of the list
    }


    public static void main(String args[]){
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        head.next.next.next.next.next = new Node(6);

        Node result = oddEvenReverse(head);

        // Print the rearranged linked list
        while (result != null) {
            System.out.print(result.val + " ");
            result = result.next;
        }
    }
}














// class Node {
//     int val;
//     Node next;
//     Node(int val) {
//         this.val = val;
//         this.next = null;
//     }
// }

// public class oddEvenReverselll {

//     // Utility to reverse a linked list
//     public static Node reverse(Node head) {
//         Node prev = null;
//         Node curr = head;
//         while (curr != null) {
//             Node next = curr.next;
//             curr.next = prev;
//             prev = curr;
//             curr = next;
//         }
//         return prev;
//     }

//     public static Node oddEvenReverse(Node head) {
//         if (head == null) return null;

//         Node oddDummy = new Node(0);
//         Node evenDummy = new Node(0);
//         Node oddTail = oddDummy;
//         Node evenTail = evenDummy;

//         Node temp = head;
//         while (temp != null) {
//             Node newNode = new Node(temp.val); // create new node to avoid sharing nodes
//             if (temp.val % 2 == 0) {
//                 evenTail.next = newNode;
//                 evenTail = evenTail.next;
//             } else {
//                 oddTail.next = newNode;
//                 oddTail = oddTail.next;
//             }
//             temp = temp.next;
//         }

//         // Reverse both lists
//         Node evenReversed = reverse(evenDummy.next);
//         Node oddReversed = reverse(oddDummy.next);

//         // Attach even reversed → odd reversed
//         Node dummy = new Node(0);
//         Node curr = dummy;

//         // Append even reversed
//         curr.next = evenReversed;
//         while (curr.next != null) {
//             curr = curr.next;
//         }

//         // Append odd reversed
//         curr.next = oddReversed;

//         return dummy.next;
//     }

//     public static void main(String args[]) {
//         Node head = new Node(1);
//         head.next = new Node(2);
//         head.next.next = new Node(3);
//         head.next.next.next = new Node(4);
//         head.next.next.next.next = new Node(5);
//         head.next.next.next.next.next = new Node(6);

//         Node result = oddEvenReverse(head);

//         // Print the rearranged linked list
//         while (result != null) {
//             System.out.print(result.val + " ");
//             result = result.next;
//         }
//     }
// }
