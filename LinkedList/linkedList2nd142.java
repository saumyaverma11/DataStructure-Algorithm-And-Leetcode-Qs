public class linkedList2nd142 {
     public ListNode detectCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while(fast!=null && fast.next!=null){
            slow= slow.next;
            fast= fast.next.next;
            if(slow== fast){
                slow = head;
                while(slow!=fast){
                    slow= slow.next;
                    fast = fast.next;
                }
                return slow;
            }
        }
        return null;
    }
     public static void main(String[] args) {
        // ✅ Creating a linked list with a cycle:
        // 1 -> 2 -> 3 -> 4 -> 5
        //           ^         |
        //           |_________|
        ListNode head = new ListNode(11);
        head.next = new ListNode(22);
        head.next.next = new ListNode(33);
        head.next.next.next = new ListNode(44);
        head.next.next.next.next = new ListNode(55);

        // Creating the cycle: 5 -> 3
        head.next.next.next.next.next = head.next.next.next;
        linkedList2nd142 dc = new linkedList2nd142();
        ListNode result = dc.detectCycle(head);

        System.out.println("Does the linked list have a cycle? " + result.val);
        int idx=0;
        ListNode temp = head;
        while(temp.val!=result.val){
            temp= temp.next;
            idx++;
        }

        System.out.println(idx+1);
    }
}
