class Node {
    int data;
    Node next; 
    Node(int data) {
        this.data = data;
         this.next = null;   }
}
class DetectCycleLinkedList {
    boolean hasCycle(Node head) {
        if (head == null) return false;
        Node slow = head;
        Node fast = head; 
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next; 
         if (slow == fast) {
                 return true;
            }        }
        return false;    }
}
public class Lab3Ex5 {
    public static void main(String[] args) { 
  Node cycleHead = new Node(1); 
  cycleHead.next = new Node(2);
  cycleHead.next.next = new Node(3);
  cycleHead.next.next.next = cycleHead.next;
  DetectCycleLinkedList cycleTest = new DetectCycleLinkedList();
  boolean cycleDetected = cycleTest.hasCycle(cycleHead);
  System.out.println("Cycle detected in linked list: " + cycleDetected); // Output: true
  
}

}