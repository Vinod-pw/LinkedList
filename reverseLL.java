class BNode {
    int val ;
    Node next;
    BNode(int val){
        this.val = val;
        this.next = null;
    }
}
public class reverseLL {
    public static Node reverseNode(Node head){
        Node curr = head;
        Node prev = null;
        Node Next = null;
        // traverse all the node of  linked list
        while (curr !=null){
            // store next
            Next = curr.next;
            // reverse current node's nest pointer
            curr.next = prev;
            // move pointer one position ahead;
            prev = curr;
            curr =Next;
        }
        // return the head of reverse linked list
        return prev;
    }
 // these method prints the contents of the linked list starting from the end
 static void print(Node head){
        while (head!=null){
            System.out.print(" " + head.val);
            head = head.next;
        }
     System.out.println();
 }
    public static void main(String[] args) {
        Node a = new Node (10);
        a.next = new Node(20);
        a.next.next = new Node(30);
        a.next.next.next = new Node(40);
        a.next.next.next.next = new Node(50);
        System.out.println("given linked list is => ");
        print(a);
        a = reverseNode(a);
        System.out.println(" reverse linked list is => ");
        print(a);
    }
}
