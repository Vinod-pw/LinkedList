// given a singly linked list and a key, the task is to count the number of occurrences
// of the given key in the linked list.
//Input : head: 1->2->1->2->1->3->1 , key = 1
//Output : 4
class DNode{
    int val;
     Node next;
     DNode(int val){
         this.val = val;
         this.next = null;
     }
}

public class CountOccurrences {
    static int count(Node head, int key) {
        Node temp = head;
        int count = 0;
        while (temp != null) {
            if (temp.val == key) {
                count++;
            }
           temp =  temp.next;
        }
        return count;
    }

    public static void main(String[] args) {
        Node a = new Node(1);
        a.next = new Node(2);
        a.next.next = new Node(1);
        a.next.next.next = new Node(2);
        a.next.next.next.next = new Node(3);
        a.next.next.next.next.next = new Node(1);
        int key = 1;

        System.out.println(count(a, key));
    }
}