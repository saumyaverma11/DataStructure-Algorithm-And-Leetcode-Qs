public class duplicate83 {

    // Definition for singly-linked list.
    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    // Function to delete duplicates
    public static ListNode deleteDuplicates(ListNode head) {
        ListNode temp = head;
        while (temp != null && temp.next != null) {
            if (temp.val == temp.next.val) {
                temp.next = temp.next.next;  // Remove the duplicate
            } else {
                temp = temp.next;  // Move forward if no duplicate
            }
        }
        return head;
    }

    // Function to print the list
    public static void printList(ListNode head) {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val);
            if (temp.next != null) System.out.print(" -> ");
            temp = temp.next;
        }
        System.out.println();
    }

    // Main function to test
    public static void main(String[] args) {
        // Create test list: 1 -> 1 -> 2 -> 3 -> 3
        ListNode node5 = new ListNode(3);
        ListNode node4 = new ListNode(3, node5);
        ListNode node3 = new ListNode(2, node4);
        ListNode node2 = new ListNode(1, node3);
        ListNode head = new ListNode(1, node2);

        System.out.print("Original List: ");
        printList(head);

        ListNode result = deleteDuplicates(head);

        System.out.print("After Removing Duplicates: ");
        printList(result);
    }
}
