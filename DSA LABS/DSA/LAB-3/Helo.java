/*class Node { 
    String name; 
    Node prev, next; 
 
    Node (String name) { 
        this.prev = null; 
        this.next = null; 
        this.name = name; 
    } 
}  
 
public class Helo { 
    Node head; 
 
    // Add node with name in beginning of linked list, name as parameter   
    public void insertAtBeginning(String name) { 
        Node newNode = new Node(name);
        insertAtBeginning(newNode);
    } 
 
    // Add node in beginning of linked list, node as parameter   
    public void insertAtBeginning(Node node) {   
        if (head == null) {
            head = node;
        } else {
            node.next = head;
            head.prev = node;
            head = node;
        }
    } 
 
    // Add node in end of linked list, name as parameter   
    public void insertAtEnd(String name) { 
        Node newNode = new Node(name);
        insertAtEnd(newNode);
    } 
 
    // Add node in end of linked list, node as parameter   
    public void insertAtEnd(Node node) { 
        if (head == null) {
            head = node;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = node;
            node.prev = temp;
        }
    } 
 
    // Add node after name which is provided as param, name and node as params   
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
            currentNode.next = node;
        }
    } 
 
    // Add node before name which is provided as param, name and node as params   
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
 
    // Make doubly linked list as Circular Doubly Linked List   
    public void makeCircular() { 
        if (head == null) return; // Empty list, no need to make circular

        Node currentNode = head;
        while (currentNode.next != null) {
            currentNode = currentNode.next;
        }
        currentNode.next = head;
        head.prev = currentNode;
    } 
 
    // Print all the nodes in linked list, make sure it works on circular doubly linked list   
    public void printAll() { 
        if (head == null) return; // Empty list, nothing to print

        Node currentNode = head;
        do {
            System.out.println(currentNode.name + " ");
            currentNode = currentNode.next;
        } while (currentNode != head);
    } 

    // Test the class          
    public static void main(String[] args) { 
        // Test all above methods  
        Helo dl = new Helo();
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



class Node {
    String name;
    Node next;

    Node(String name) {
        this.name = name;
        this.next = null;
    }
}
class SinglyLinkedListWithTail {
    Node head;
    Node tail;

    public SinglyLinkedListWithTail() {
        head = null;
        tail = null;
    }

    // Add node at the beginning
    public void insertAtBeginning(String name) {
        Node newNode = new Node(name);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    // Add node at the end
    public void insertAtEnd(String name) {
        Node newNode = new Node(name);
        if (tail == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    // Remove node from the beginning
    public void removeFromBeginning() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        if (head == tail) {
            head = null;
            tail = null;
        } else {
            head = head.next;
        }
    }

    // Remove node from the end
    public void removeFromEnd() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        if (head == tail) {
            head = null;
            tail = null;
        } else {
            Node current = head;
            while (current.next != tail) {
                current = current.next;
            }
            current.next = null;
            tail = current;
        }
    }

    // Print all nodes
    public void printAll() {
        Node current = head;
        while (current != null) {
            System.out.print(current.name + " ");
            current = current.next;
        }
        System.out.println();
    }
}
 class SinglyLinkedListWithHead {
    Node head;

    public SinglyLinkedListWithHead() {
        head = null;
    }

    // Add node at the beginning
    public void insertAtBeginning(String name) {
        Node newNode = new Node(name);
        newNode.next = head;
        head = newNode;
    }

    // Add node at the end
    public void insertAtEnd(String name) {
        Node newNode = new Node(name);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    // Remove node from the beginning
    public void removeFromBeginning() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        head = head.next;
    }

    // Remove node from the end
    public void removeFromEnd() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        if (head.next == null) {
            head = null;
            return;
        }
        Node current = head;
        while (current.next.next != null) {
            current = current.next;
        }
        current.next = null;
    }

    // Print all nodes
    public void printAll() {
        Node current = head;
        while (current != null) {
            System.out.print(current.name + " ");
            current = current.next;
        }
        System.out.println();
    }
}
*/