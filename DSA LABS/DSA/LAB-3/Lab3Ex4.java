class Node {
    int data;
    Node next; 
    Node(int data) {
        this.data = data;
         this.next = null;   }
}
class CircularLinkedList {
    Node head, tail;
    void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            tail.next = head;
        } else {
            newNode.next = head;
            head = newNode;
            tail.next = head;        }
    }
    void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            tail.next = head;
        } else {
            tail.next = newNode;
            tail = newNode;
            tail.next = head;       } 
    } 
    void removeFromBeginning() {
        if (head == null) return;
        if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
            tail.next = head;        }
    }
    void removeFromEnd() {
        if (head == null) return;
        if (head == tail) {
            head = tail = null;
        } else {
            Node current = head;
            while (current.next != tail) {
                current = current.next;
            }
            tail = current;
            tail.next = head;        }
     }
  void display() {
    if (head == null) return;
        Node current = head;
        do {
            System.out.print(current.data + " ");
            current = current.next;
        } while (current != head);
        System.out.println();    }
 
}
public class Lab3Ex4{
    public static void main(String[] args) {
  CircularLinkedList cll = new CircularLinkedList();
  cll.insertAtEnd(100);
 cll.insertAtEnd(200);
 cll.insertAtBeginning(50);
 System.out.println("Circular Linked List:");
 cll.display();
 cll.removeFromEnd();
 cll.display();
 cll.removeFromBeginning();
 cll.display();
}}