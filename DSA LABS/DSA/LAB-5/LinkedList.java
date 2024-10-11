import java.util.Stack;
class Node {
    int data ;
    Node next;
    Node (int data){
        this.data=data;
        this.next=null;
    }
}
 class Linkedlist {
Node head;
     public void Add(int data) {
         Node newNode = new Node(data);
         System.out.println("Adding: " + data); // Debug print to confirm addition
         if (head == null) {
             head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
  temp.next = newNode;
    }
  // New method to print list in reverse order without modifying the list
    void printReverse() {
        System.out.println("Entering printReverse method"); // Debug print
 
        Stack <Integer> stack = new Stack<>();
        Node temp = head;
        // Push all node data to the stack
        while (temp != null) {
            stack.push(temp.data);
            temp = temp.next;
        }
        // Print all elements in the stack (in reverse order)
        System.out.println("Printing list in reverse order:");
        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }
        System.out.println();
    } 
    void printList() {
         System.out.println("Entering printList method"); // Debug print
         if (head == null) {
             System.out.println("Linked list is empty");
         } else {
             Node temp = head;
             System.out.println("Printing the list:");
             while (temp.next != null) {
                 System.out.print(temp.data + " ");
                 temp = temp.next;
             }
             System.out.println(temp.data);
         }
   }
    public static void main(String[] args) {
 
        Linkedlist l1 = new Linkedlist();
        
         l1.Add(2);
         l1.Add(4);
         l1.Add(6);
         l1.Add(8); 
        System.out.println("Original Linked List:");
         l1.printList();
        System.out.println("Linked List printed in reverse (without modifying):");
        l1.printReverse();
    }
 

 }