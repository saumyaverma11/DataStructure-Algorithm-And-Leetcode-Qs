import java.util.*;

class Node{
    int data;
    Node next;

    Node(int data){
        this.data = data;
        this.next = null;
    }
}


public class intersectionTwoLL {
    public static Node getIntersectionNode(Node head1, Node head2){
        HashSet<Node> set = new HashSet<>();
        while(head1 != null){
            set.add(head1);
            head1= head1.next;
        }
        while(head2 != null){
            if(set.contains(head2)){
                return head2;
            }
            head2 = head2.next;
        }
        return null;

    }

    public static Node insertNode(Node head, int data){
        Node newNode= new Node(data);
        if(head== null){
            return newNode;
        }else{
            Node current = head;
            while(current.next != null){
                current = current.next;
            }
            current.next = newNode;
            return head;
        }
    }
    public static Node newInsertNode(Node head, int position){
        int index=0;
        while(head!= null && index<position){
            head= head.next;
            index++;
        }
        return head; // Returns the node at the specified position
    }
    public static void main(String[] args) {
        Node head1= null;
        Node  head2= null;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of nodes in the first linked list:");
        int n = sc.nextInt();
        System.out.println("Enter the elements of the first linked list:");
        for(int i=0; i<n; i++){
            int data = sc.nextInt();
            head1 = insertNode(head1, data);
        }
        System.out.println("Enter the number of nodes in the second linked list:");
        int m = sc.nextInt();
        System.out.println("Enter the elements of the second linked list:");
        for(int i=0; i<m; i++){
            int data = sc.nextInt();
            head2 = insertNode(head2, data);
        }

        System.out.println("Enter the intersection point (index) for the second linked list (-1 if no intersection):");
        int intersectionIndex = sc.nextInt();
    
        Node newIntersectIndexNode = newInsertNode(head1,intersectionIndex); // Create a new node to point to the intersection
        if(intersectionIndex != -1 && newIntersectIndexNode != null){
            Node current = head2;
            while(current.next != null){
                current = current.next;
            }
            current.next = newIntersectIndexNode; // Link the end of second list to the intersection point
        }
        
    

        System.out.println("This is the point where both Linked Lists intersects:");
        Node point= getIntersectionNode(head1,head2);
        if(point != null){
            System.out.println("The intersection point is: " + point.data);
        } else {
            System.out.println("There is no intersection point.");
        }
    }
}
