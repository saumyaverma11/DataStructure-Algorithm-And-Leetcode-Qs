import java.util.*;
 class ListNode {
    int val;
     ListNode next;
    ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

public class mergeTwoSortedList21 {

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode(0);
        ListNode newList = dummy;
        ListNode temp = list1;
        ListNode temp2 = list2;
        while(temp!=null && temp2!=null){
            if(temp.val <=temp2.val){
                dummy.next= temp;
                  temp=temp.next;
            }
            else{
                dummy.next = temp2;
                 temp2=temp2.next;               
            }
            dummy= dummy.next;
        }

       
        while(temp!=null){
            dummy.next= temp;
            temp=temp.next;
            dummy=dummy.next;
        }
         while(temp2!=null){
            dummy.next= temp2;
            temp2=temp2.next;
            dummy=dummy.next;
        }

        
        return newList.next;
    }

    public static void main(String[] args) {
        mergeTwoSortedList21 list = new mergeTwoSortedList21();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of first list: ");
        int size1 = sc.nextInt();
        System.out.println("Enter the size of second list: ");
        int size2 = sc.nextInt();
        System.out.println("Enter the elements of first list: ");
        ListNode list1 = null;
        for(int i=0;i<size1;i++){
            int val = sc.nextInt();
            ListNode newNode = new ListNode(val);
            if(list1 == null){
                list1 = newNode;
            }
            else{
                ListNode temp = list1;
                while(temp.next!=null){
                    temp = temp.next;
                }
                temp.next = newNode;
            }
        }
        System.out.println("Enter the elements of second list: ");
        ListNode list2 = null;
        for(int i=0;i<size2;i++){
            int val= sc.nextInt();
            ListNode newNode= new ListNode(val);
            if(list2==null){
                list2= newNode;
            }
            else{
                ListNode temp= list2;
                while(temp.next!=null){
                    temp=temp.next;
                }
                temp.next= newNode;
            }
        }

        ListNode mergedList = mergeTwoLists(list1, list2);
        System.out.println("Merged List: ");
        ListNode temp= mergedList;
        while(temp!=null){
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
    }
}