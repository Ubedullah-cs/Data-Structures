class Node{
    int data;
    Node next;
    //Constructor
    Node(int data)
    {
    this.data=data;
    this.next=null;
    }
   }
   public class Lab2Ex2{
    Node head;
    void addToBack(int data)
    {
    Node node=new Node(data);
   
    if(head==null)
    head=node;
    
    else{
    Node n=head;
    while(n.next!=null)
    n=n.next;
    n.next=node;
    }
    }
    void printList() {
    Node node = head;
    while (node.next != null){
    System.out.print(node.data + " ");
    node = node.next;
 }
 System.out.print(node.data + " ");
 }
 void addToFront(int data)
 {
 Node node =new Node(data);

 node.next=head;
 head=node;
 }
 void addMiddle(int index,int data)
 {
 Node  node =new Node(data);
 node.data=data;
 node.next=null;
 Node n=head;
 for(int i=1;i<index-1;i++)
 {
 n=n.next;
 }
 node.next=n.next;
 n.next=node;
 }
 void removeFromFront()
 {
 head=head.next;
 }
 void removeFromBack()
 {
 Node n=head;
 while(n.next.next!=null)
 n=n.next;
 n.next=null;
 }
 void removeAt(int index)
 {
 if (index==1)
 removeFromFront();
 
 else{
 Node n=head;
 Node temp=null;
 
for(int i=1;i<index-1;i++)
 {
 n=n.next;
 }
 temp=n.next;
 n.next=temp.next;
 }}
 boolean isEmpty(){
 return head == null;
 } 
 // For length of linkedList
int getLength(){
    Node n =head;
    int lenth=0;
    while (n!=null) {
        lenth++;
        n=n.next;
        
    }
    return lenth;
}
 public static void main(String[] args) {
 Lab2Ex2 ll=new Lab2Ex2();
 ll.addToBack(5);
 ll.addToBack(19);

int size =ll.getLength();
System.out.println("the lenth of linkedlist is :"+size);
}
   }