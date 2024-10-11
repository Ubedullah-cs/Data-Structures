class Node {
    int data;
    Node next;
     Node(int data) {
         this.data = data;
         this.next = null;    }
}
class GenericNode<T> {
    T data;
    GenericNode<T> next, prev;
    GenericNode(T data) {
        this.data = data;
        this.next = null;
        this.prev = null;    }} 
class DoublyLinkedList<T> {
    GenericNode<T> head, tail;
     void insertAtBeginning(T data) {
        GenericNode<T> newNode = new GenericNode<>(data);
        if (head == null) {
            head = tail = newNode;
        } else { 
            newNode.next = head;
            head.prev = newNode;
            head = newNode;        } 
    }
    void insertAtEnd(T data) {
        GenericNode<T> newNode = new GenericNode<>(data);
        if (tail == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;      } 
    }
    void removeFromBeginning() {
        if (head == null) return;
        head = head.next;
        if (head != null) head.prev = null;
        else tail = null; 
    }
    void removeFromEnd() {
        if (tail == null) return;
        if (head == tail) {
            head = tail = null;
        } else {
            tail = tail.prev;
            tail.next = null;        }    }
    void display() {
        GenericNode<T> current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();    }}
 public class Lab3Ex3{
        public static void main(String[] args) {
  DoublyLinkedList<Integer> dll = new DoublyLinkedList<>();
  dll.insertAtBeginning(1);
  dll.insertAtEnd(2);
  dll.insertAtEnd(3);
  System.out.println("Doubly Linked List:");
  dll.display();
  dll.removeFromBeginning();
  dll.display();
  dll.removeFromEnd();
  dll.display();
}}