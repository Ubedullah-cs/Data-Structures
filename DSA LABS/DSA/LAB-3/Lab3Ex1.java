class Node { 
    String name; 
    Node prev, next; 
 
    Node (String name) { 
        this.prev = null; 
        this.next = null; 
        this.name = name;     }}  
public class Lab3Ex1 { 
    Node head; 
        public void insertAtBeginning(String name) { 
        Node newNode = new Node(name);
        insertAtBeginning(newNode);
    } 
     public void insertAtBeginning(Node node) {   
        if (head == null) {
            head = node;
        } else {
            node.next = head;
            head.prev = node;
            head = node;        }   }    
    public void insertAtEnd(String name) { 
        Node newNode = new Node(name);
        insertAtEnd(newNode);
    } 
     public void insertAtEnd(Node node) { 
        if (head == null) {
            head = node;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = node;
            node.prev = temp;        }    } 
    public void insertAfterName(String name, Node node) { 
        Node currentNode = head;
        while (currentNode != null && !currentNode.name.equals(name)) {
            currentNode = currentNode.next;
        }
        if (currentNode != null) {
            node.next = currentNode.next;
            node.prev = currentNode;
            if (currentNode.next != null) {
                currentNode.next.prev = node;
            }
            currentNode.next = node;        }    }   
    public void insertBeforeName(String name, Node node) { 
        Node currentNode = head;
        while (currentNode != null && !currentNode.name.equals(name)) {
            currentNode = currentNode.next;
        }
        if (currentNode != null) {
            node.prev = currentNode.prev;
            node.next = currentNode;
            if (currentNode.prev != null) {
                currentNode.prev.next = node;
            } else {
                head = node;
            }
            currentNode.prev = node;
        }
    }    
    public void makeCircular() { 
        if (head == null) return; // Empty list, no need to make circular
        Node currentNode = head;
        while (currentNode.next != null) {
            currentNode = currentNode.next;
        }
        currentNode.next = head;
        head.prev = currentNode;    }
    public void printAll() { 
        if (head == null) return; // Empty list, nothing to print
        Node currentNode = head;
        do {
            System.out.println(currentNode.name + " ");
            currentNode = currentNode.next;
        } while (currentNode != head);
    } 
    public static void main(String[] args) {   
        Lab3Ex1 dl = new Lab3Ex1();
        dl.insertAtBeginning("A");
        dl.insertAtBeginning("B");
        dl.insertAtEnd("C");
        dl.insertAtEnd("D");
        Node newNode = new Node("E");
        dl.insertAfterName("C", newNode);
        dl.insertBeforeName("B", newNode);
        dl.makeCircular();
        dl.printAll();
    }
}
