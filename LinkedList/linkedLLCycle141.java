class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
        next = null;
    }
}

public class linkedLLCycle141 {

    public boolean hasCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return true; // Cycle detected
            }
        }
        return false; // No cycle
    }

    public static void main(String[] args) {
        // ✅ Creating a linked list with a cycle:
        // 11 -> 22 -> 33 -> 44 -> 55
        //                  ^      |
        //                  |______|
        ListNode head = new ListNode(11);
        head.next = new ListNode(22);
        head.next.next = new ListNode(33);
        head.next.next.next = new ListNode(44);
        head.next.next.next.next = new ListNode(55);

        // Creating the cycle: 55 -> 33
        head.next.next.next.next.next = head.next.next;

        linkedLLCycle141 dc = new linkedLLCycle141();
        boolean hasCycle = dc.hasCycle(head);

        System.out.println("Does the linked list have a cycle? " + hasCycle);
    }
}
