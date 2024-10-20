//Java program to count number of nodes
// in a circular linked list
class FNode{
    int val;
    Node next;
    FNode(int val){
        this.val = val;
        this.next = null;
    }
}
public class countNode {
    static int CountNode(Node head){
        if (head == null)
            return 0;
        int res  = 0;
        while (head != null){
            res++;
            head  = head.next;
        }
        return res;
    }
    public static void main(String[] args) {
        Node a = new Node(1);
        a.next = new Node(2);
        a.next.next = new Node(1);
        a.next.next.next = new Node(2);
        a.next.next.next.next = new Node(3);
        a.next.next.next.next.next = new Node(1);
        System.out.println("total Number of node is=> "+ CountNode(a));
    }
}
