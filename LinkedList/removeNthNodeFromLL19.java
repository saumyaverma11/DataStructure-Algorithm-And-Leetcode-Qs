import java.util.Scanner;

public class removeNthNodeFromLL19 {

    static public ListNode head = null;

    public void createList(int size, Scanner sc) {
        for (int i = 0; i < size; i++) {
            int val = sc.nextInt();
            makenode(val);
        }

    }

    public void makenode(int val) {
        ListNode newNode = new ListNode(val);
        if (head == null) {
            head = newNode;
            return;
        }
        // addLast
        ListNode temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;

    }

    public static void printList(ListNode head) {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static ListNode removeNthFromEnd(ListNode head, int n) {

        if (head == null) {
            return head;
        }
        int num = 1;
        ListNode temp = head;
        while (temp.next != null) {
            num++;
            temp = temp.next;
        }

        if (num == n) {
            return head.next;
        }
        int index = num - n;

        ListNode temp2 = head;
        for (int i = 1; i < index; i++) { // index = 4
            temp2 = temp2.next;
        }

        if (temp2.next != null) {
            temp2.next = temp2.next.next;
        }

        return head;
    }

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    removeNthNodeFromLL19 obj = new removeNthNodeFromLL19();

    System.out.print("Size of linked list: ");
    int n = sc.nextInt();

    System.out.println("Enter " + n + " node values:");
    obj.createList(n, sc);

    System.out.print("Remove nth node from end (n = ): ");
    int k = sc.nextInt();

    System.out.println("Before:");
    printList(head);

    head = removeNthFromEnd(head, k);

    System.out.println("After:");
    printList(head);
}

}
