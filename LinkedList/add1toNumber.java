import java.util.*;

class Node{
    int data;
    Node next;
    Node(int data){
        this.data= data;
    }
}
public class add1toNumber{

    public static Node makeNode(Node head, int data){
        Node newNode= new Node(data);
         if(head==null){
            return newNode;
        }
        Node temp= head;
        while(temp.next!=null){
            temp= temp.next;
        }
        temp.next= newNode;
        return head;
    }
    public static void display(Node head)
    {
        if(head== null){
            System.out.println("ll is null");
            return;
        }
        Node temp= head;
        while(temp!=null){
            System.out.print(temp.data+ " ");
            temp= temp.next;
        }
        
    }
    public static Node reverse(Node head){
        Node prev= null;
        Node next;
        Node temp= head;
        while(temp!=null){
            next= temp.next;
            temp.next= prev;
            prev= temp;
            temp= next;
        } 
        return prev;
    }
    public static Node addNumber(Node head){
        head = reverse(head);
        Node temp = head;
        Node curr= head;
        int sum=0;
        int carry=0;

        sum= curr.data + 1;
        curr.data = sum%10;
        carry= sum/10;
        curr= curr.next;

        while(curr!=null && carry>0){
            sum = curr.data + carry;
            curr.data = sum%10;
            carry = sum/10;
            temp = curr;
            curr= curr.next;
        }
        if(carry>0){
            Node newNode= new Node(1);
            temp.next = newNode;
        }

        head= reverse(head);
        return head;
    }
    public static void main(String[] args) {
        Node head= null;
        Scanner sc= new Scanner(System.in);
        System.out.println("enter size");
        int n = sc.nextInt();
        System.out.println("enter elements");
        for(int i=0;i<n;i++){
            int data= sc.nextInt();
            head = makeNode(head, data);
        }
        // display(head);
        Node afterAdding = addNumber(head);
        display(afterAdding);
        
        sc.close();
    }
}