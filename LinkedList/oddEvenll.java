class ListNode {
    int val;                    
    ListNode next;
    ListNode(int x) { 
        val = x; 
        next = null; 
    }
}
public class oddEvenll {
    /**
     * This method rearranges the linked list such that all odd indexed nodes come before even indexed nodes.
     * 
     * @param head The head of the linked list.
     * @return The head of the rearranged linked list.
     */
    public ListNode oddEvenList(ListNode head) {
        ListNode oddList = new ListNode(0);
        if(head== null){
            return null;
        }
        ListNode evenList = new ListNode(0);

        ListNode oddtail = oddList;
        ListNode eventail = evenList;

        ListNode temp = head;
        while(temp!=null){
            if(temp.val%2 !=0){
                oddtail.next= temp;
                oddtail= oddtail.next;
            }
            else{
                eventail.next= temp;
                eventail= eventail.next;
            }
            temp= temp.next;
        }
        
        eventail.next = null;          //terminate the even , meand found the end.
        oddtail.next = evenList.next;
        
        return oddList.next;
    }
    public static void main(String[] args) {
        oddEvenll obj = new oddEvenll();
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        ListNode result = obj.oddEvenList(head);
        
        // Print the rearranged linked list
        while (result != null) {
            System.out.print(result.val + " ");
            result = result.next;
        }
    }
}



// import java.util.LinkedList;

// class Node {
//     int val;
//     Node next;

//     Node() {}
//     Node(int val) { this.val = val; }
//     Node(int val, Node next) {
//         this.val = val;
//         this.next = next;
//     }
// }

// public class Solution {

//     public static Node oddEvenList(Node head) {
//         if (head == null) return null;

//         LinkedList<Integer> oddList = new LinkedList<>();
//         LinkedList<Integer> evenList = new LinkedList<>();

//         // Step 1: Traverse and collect values
//         Node temp = head;
//         while (temp != null) {
//             if (temp.val % 2 != 0) {
//                 oddList.add(temp.val);
//             } else {
//                 evenList.add(temp.val);
//             }
//             temp = temp.next;
//         }

//         // Step 2: Merge both lists (odd first)
//         oddList.addAll(evenList);

//         // Step 3: Create new linked list from merged values
//         Node dummy = new Node(0);
//         Node curr = dummy;

//         for (int val : oddList) {
//             curr.next = new Node(val);
//             curr = curr.next;
//         }

//         return dummy.next; // Return new head
//     }

//     // Helper function to print the list
//     public static void printList(Node head) {
//         Node curr = head;
//         while (curr != null) {
//             System.out.print(curr.val + " -> ");
//             curr = curr.next;
//         }
//         System.out.println("null");
//     }

//     // Main method to test the code
//     public static void main(String[] args) {
//         // Creating a sample list: 1 -> 2 -> 3 -> 4 -> 5
//         Node head = new Node(1, new Node(2, new Node(3, new Node(4, new Node(5)))));

//         System.out.println("Original List:");
//         printList(head);

//         Node newHead = oddEvenList(head);

//         System.out.println("Reordered List (odd values first, then even):");
//         printList(newHead);
//     }
// }
