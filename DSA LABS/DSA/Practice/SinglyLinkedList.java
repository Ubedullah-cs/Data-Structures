class Node {
    int data;
    Node next;

    Node (int data){
        this.data=data;
        this.next=null;
    }

}

class SinglyLinkedList {
    Node head;

    void addAtENd(int data )
    {
        Node newNode= new Node(data);
        if(head == null){
            head = newNode;
        }
        else{
            Node temp = head;
            while (temp.next!=null) {
                temp=temp.next;
            }
            temp.next=newNode;
        }

    }
void addAtBeggininng (int data ){
    Node newNode = new Node(data);
    if (head == null) {
        head = newNode;    
    }
newNode.next=head;
head=newNode;
}
boolean isEmpty(){
    return head==null;
}
void print (){
    Node temp = head;
    while (temp!=null) {
        System.out.println(temp.data+ " ");
        
    }
}
public static void main(String[] args) {
    SinglyLinkedList sl = new SinglyLinkedList();
    sl.addAtBeggininng(2);
    sl.addAtBeggininng(1);
    sl.addAtENd(3);
    sl.print();
}
    
}