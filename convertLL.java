// Java Program for converting singly linked list
// into circular linked list.
class GNode{
    int  val;
    Node next;
    GNode (int val ){
        this.val = val;
        this.next = null;
    }
}
public class convertLL {
    static Node convertLinkedListToCircularLL(Node head) {
        // declare a node variable curr and
        // assign head node into curr node.
        Node curr = head;

        // check that while curr->next is not equal
        // to NULL then curr points to next node.
        while (curr.next != null)
            curr = curr.next;

        // assign curr->next to the head node.
        curr.next = head;
        return head;
    }
    static void printList(Node head) {
        Node curr = head;
        do {
            System.out.print(curr.val + " ");
            curr = curr.next;
        } while (curr != head);
        System.out.println();

    }


    public static void main(String[] args) {
        Node a = new Node (1);
        a.next = new Node (2);
        a.next.next = new Node (3);
        a.next.next.next = new Node(4);
        a.next.next.next.next = new Node(5);
        a.next.next.next.next.next = new Node(6);
        a = convertLinkedListToCircularLL(a);
        printList(a);
      //  System.out.println(convertLinkedListToCircularLL(a));
    }
}
