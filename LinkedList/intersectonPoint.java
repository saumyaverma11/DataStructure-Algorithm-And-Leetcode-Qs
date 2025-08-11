import java.util.*;

class Node{
    int data;
    Node next;
    Node(int data){
        this.data= data;
    }
}
public class intersectonPoint {
    public static Node makeNode( Node head, int data){
        Node newNode = new Node(data);
        if(head== null){
            return newNode;
        }
        Node temp= head;
        while(temp.next!= null){
            temp= temp.next;
        }
        temp.next = newNode;
        return head;
    }
    public static void display(Node head){
        Node temp = head;
        if(temp== null){
            System.out.println("ll is empty");
            return;
        }
        while(temp!=null){
            System.out.print(temp.data + " ");
            temp= temp.next;
        }
    }
    public static Node intersectionPoint(Node head, Node head2)
    {
        HashSet<Node> set  = new HashSet<>();
        while(head!= null){
            set.add(head);
            head= head.next;
        }
        while(head2!=null){
            if(set.contains(head2)){
                return head2;
            }
            head2= head2.next;
        }
        return null;   }
    public static void main(String[] args) {
      Node head = null;
      Scanner sc = new Scanner(System.in);
      System.out.println("enter size of first ll");
      int n= sc.nextInt();
      System.out.println("enter elements ");
      for(int i=0;i<n;i++){
        int data = sc.nextInt();
        head= makeNode( head, data);
      }

      Node head2 = null;
      System.out.println("enter size of second ll");
      int n2= sc.nextInt();
      System.out.println("enter element");
      for(int i=0;i<n2;i++){
        int data = sc.nextInt();
        head2= makeNode(head2, data);
      }


      Node commonHead = null;
      System.out.println("common size ");
      int n3 = sc.nextInt();
        System.out.println("enter element");
      for(int i=0;i<n3;i++){
        int data = sc.nextInt();
        commonHead= makeNode(commonHead, data);
      }


      Node temp = head;
      while(temp!=null){
        temp= temp.next;
      }
      temp.next = commonHead;
      Node temp2 = head2;
      while(temp2!=null){
        temp2= temp2.next;
      }
      temp2.next = commonHead;





      display(head);
      System.out.println();
      display(head2);
      System.out.println();

      Node point =  intersectionPoint(head, head2);
      if(point!= null){
        System.out.println(point.data);
      }
      else{
        System.out.println(point);
      }
    }
}
