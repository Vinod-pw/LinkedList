 class CNode{
    int val;
    Node next;
    CNode (int val){
        this.val = val;
        this.next = null;
    }
 }
public class findMiddleLL {
    static int middleNode(Node head){
        Node slow = head;
        Node fast =  head;
        while (fast!=null && fast.next !=null){
            fast = fast.next.next;
            slow = slow.next;
            //fast = fast.next.next;
        }
        return slow.val;
    }
    static  void print (Node head){
        while (head!=null){
           System.out.print(" " + head.val);
            head = head.next;


        }
      //  System.out.println();
    }
    public static void main(String[] args) {
        Node a = new Node (1);
        a.next = new Node (2);
        a.next.next = new Node (3);
        a.next.next.next = new Node(4);
        a.next.next.next.next = new Node(5);
        a.next.next.next.next.next = new Node(6);
        print(a);
        System.out.println();
        System.out.println("middle element is => ");
        System.out.println( middleNode(a));

    }
}
