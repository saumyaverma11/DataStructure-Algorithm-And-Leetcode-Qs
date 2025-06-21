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

