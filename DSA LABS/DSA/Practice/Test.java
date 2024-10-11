class Node {
    int data;
    Node next;

  public  Node (int data){
        this.data=data;
        this.next=null;
    }

}

class Test {
    Node head,tailNode;

    void addAtENd(int data )
    {
        Node newNode= new Node(data);
        if(head == null){
            head = tailNode=newNode;
        }
        else{
            // Node temp = head;
            // while (temp.next!=null) {
            //     temp=temp.next;
            // }
            tailNode .next=newNode;
            tailNode = newNode;
        }

    }
void addAtBeggininng (int data ){
    Node newNode = new Node(data);
    if (head == null) {
        head = tailNode=newNode;
        return;    
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
    Test  sl = new Test();
    sl.addAtBeggininng(2);
    sl.print();
    sl.addAtBeggininng(1);
    sl.print();
    sl.addAtENd(3);
    sl.print();
}
    
}