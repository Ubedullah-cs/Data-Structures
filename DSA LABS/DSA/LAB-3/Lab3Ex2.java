class Node {
    int data;
    Node next;
     Node(int data) {
        this.data = data;
         this.next = null;   }}
class SingleLinkedList {
    Node head, tail; 
    SingleLinkedList() {
         this.head = null;
         this.tail = null;     }
     void insertAtBeginning(int data) {
         Node newNode = new Node(data);
         if (head == null) {
             head = tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }    } 
    void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (tail == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;        }    }
    void removeFromBeginning() { 
        if (head == null) 
        return;
        head = head.next;
        if (head == null) tail = null;
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
             tail.next = null;
         }}
     void display() {
         Node current = head;
         while (current != null) {
             System.out.print(current.data + " ");
             current = current.next;
         }
         System.out.println();
     }}
public class Lab3Ex2 {
    public static void main(String[] args) { 
        SingleLinkedList sll = new SingleLinkedList();
         sll.insertAtEnd(10);
         sll.insertAtEnd(20);
         sll.insertAtBeginning(5);
         System.out.println("Single Linked List:");
         sll.display();
         sll.removeFromEnd();
         sll.display();
        sll.removeFromBeginning();
        sll.display();
    }
}