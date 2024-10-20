// Java program to check if linked list is circular
class ENode{
    int val;
    Node next;
    ENode (int val){
        this.val = val;
        this.next = null;
    }
}
public class checkCircularOrNot {
    public static  boolean isCircular(Node head){
        if (head == null)
            return  true;
        Node slow = head;
        Node fast = head.next;
        while (fast != null && fast.next != null) {
            if (slow == fast)
                return true;

            slow = slow.next;
            fast = fast.next.next;

        }
        return  false;
    }
    public static void main(String[] args) {
        Node a = new Node(10);
        a.next =new Node(20);
        a.next.next = new Node(30);
        a.next.next.next = new Node(40);
        // Check if the linked list is circular
        System.out.println(isCircular(a) ? "Yes" : "No");
        a.next.next.next.next = a;
        // Check if the linked list is not circular
        System.out.println(isCircular(a) ? "Yes" : "No");
    }
}
