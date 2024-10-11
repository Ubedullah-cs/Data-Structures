class Node{
    int data;
    Node next;
    Node(int data){
    this.data=data;
    this.next=null;}}
   public class Lab2Ex1{
    Node head;
    void addToBack(int data){
    Node node=new Node(data);
    if(head==null)
    head=node;
    else{
    Node n=head;
    while(n.next!=null)
    n=n.next;
    n.next=node;}}
    void printList() {
    Node node = head;
    while (node.next != null){
    System.out.print(node.data + " ");
    node = node.next; }
 System.out.print(node.data + " "); }
 void addToFront(int data){
 Node node =new Node(data);
 node.next=head;
 head=node; }
 void addMiddle(int index,int data){
 Node  node =new Node(data);
 node.data=data;
 node.next=null;
 Node n=head;
 for(int i=1;i<index-1;i++){
 n=n.next; }
 node.next=n.next;
 n.next=node; }
 void removeFromFront() {
 head=head.next; }
 void removeFromBack() {
 Node n=head;
 while(n.next.next!=null)
 n=n.next;
 n.next=null; }
 void removeAt(int index) {
 if (index==1)
 removeFromFront();
 else{
 Node n=head;
 Node temp=null;
for(int i=1;i<index-1;i++){
 n=n.next;}
 temp=n.next;
 n.next=temp.next;}}
 boolean isEmpty(){
 return head == null; 
}
//value seacrh method 
   int search (int value)
   {
   Node n=head;
   int index=0;
   while (n!=null) {
    if(n.data==value)
    {
        return index;
    }
    n=n.next;
    index++;
   }
    return -1; }//means not found 
 public static void main(String[] args) {
 Lab2Ex1 ll=new Lab2Ex1();
 ll.addToBack(5);
 ll.addToBack(19);
 System.out.println("Searching for 19: " + ll.search(5)); 
 System.out.println("Searching for 10: " + ll.search(10)); 
}
}