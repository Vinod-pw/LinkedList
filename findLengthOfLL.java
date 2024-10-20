class ANode{
    int val;
    Node next;
   ANode (int val){
        this.val = val;
        this.next = null;
    }
}
public class findLengthOfLL {
   // Iterative Approach to Find the Length of a Linked List
    static int findLength(Node head){
        int count = 0;
        Node temp = head;
        while (temp!=null){
            count ++;
           temp =  temp.next;
        }
        return  count;
    }
    // Recursive Approach to Find the Length of a Linked List
//    static int findLength(Node head){
//        if (head==null){
//            return 0;
//        }
//        return 1 + findLength(head.next);
//
//    }

    public static void main(String[] args) {
        Node a = new Node(10);
        a.next = new Node(2);
        a.next.next = new Node (3);
        a.next.next.next = new Node(9);
        a.next.next.next.next = new Node(8);
        a.next.next.next.next.next = new Node(80);
        System.out.println("count length is =>"+ findLength(a));
    }
}
