
    class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }
}


public class detectCycle141 {
    public boolean hasCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                return true;
            }
        }

        return false;
    }

    // 🔽 Main method to test your solution
    public static void main(String[] args) {
        // ✅ Creating a linked list with a cycle:
        // 1 -> 2 -> 3 -> 4 -> 5
        //           ^         |
        //           |_________|
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        // Creating the cycle: 5 -> 3
        head.next.next.next.next.next = head.next.next;
        detectCycle141 dc = new detectCycle141();
        boolean result = dc.hasCycle(head);

        System.out.println("Does the linked list have a cycle? " + result);
    }
}
