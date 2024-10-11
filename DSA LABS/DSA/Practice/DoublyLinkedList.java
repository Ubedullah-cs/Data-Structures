class Node{
    int data ;
    Node next, prev;

    Node (int data ){
        this.data=data;
        this.next=null;
        this.prev=null;
    }

}
class DoublyLinkedList{
    Node head;
    void addfont(int data){
Node newNode= new Node(data);
if (head == null) {
    head = newNode;
}
else{
    head.prev=newNode;
    newNode.next=head;
    head=newNode;
}
    }

void addAtEnd(int data){
    Node newNode = new Node(data);
    if(head == null){
        head = newNode;
    }
    Node temp = head;
    while (temp.next!=null) {
        temp=temp.next;
    }
    temp.next=newNode;
    newNode.prev=temp;
}
void removeFront(){
    if(head == null){
        System.out.println("List is Empty");
    }
    else{
        head=head.next;
        head.prev=null;
    }
}
void removeAtEnd(){
    if(head == null){
        System.out.println("List is Empty");
    }
    else{
        Node temp=head;
        while (temp.next.next!=null) {
            temp=temp.next;
        }
        temp.next=null;
    }
}
void removeAtindex(int index ){
    if (index==1) {
        removeFront();
    }
    else{
        Node temp = head;
        for(int i=1;i<index-1;i++){
            temp=temp.next;
        }
        if (temp.next!=null) {
            
        
        temp.prev.next=temp.next;
        temp.next.prev=temp.prev;
    }else{
        temp.prev.next=null;
    }

    }
}
void printList(){
    Node temp=head;
    while (temp!=null) {
System.out.println(temp.data+"");        
    }
}
public static void main(String[] args) {
    DoublyLinkedList dl=new DoublyLinkedList();
    dl.addAtEnd(10);
    dl.addAtEnd(20);
    dl.addAtEnd(30);
    dl.addfont(5);

}
}