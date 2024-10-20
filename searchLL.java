class Node {
    int val;
    Node next;
    Node (int val){
        this.val = val;
        this.next = null;
    }
}

public class searchLL {
   // Search an element in a Linked List (Iterative Approach)
//    static boolean searchElement(Node head , int target) {
//        Node curr = head;
//        while (curr !=null){
//            if (curr.val==target)
//                return true;
//            curr = curr.next;
//        }
//         return false;
//    }

    //Search an element in a Linked List (Recursive Approach)
    static boolean searchElement(Node head , int target){
        Node temp = head;
        if (temp==null) // base case
            return false;
        if (temp.val== target)
            return true;
        // recur for remaining list
        return searchElement(head.next , target);
    }
    public static void main (String []args){
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head.next.next.next.next = new Node(50);
        int target = 60;
        if (searchElement(head,target))
            System.out.println("yes");
        else System.out.println("no");
    }
}
