class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        this.next = null;    }}
class Queue
{
 private static Node rear = null, front = null;
 public static void dequeue(){
    if(front != null){
        System.out.println("Removing " + front.data);
        front = front.next;
    }
    else{
        System.out.println("Queue is Empty");    } }
void display(){
    Node temp = front;
    while(temp != null){

        System.out.println(temp.data + " ");
        temp = temp.next;    }}
 public static void enqueue(int item){
    System.out.println("Inserting " + item);
    Node newNode = new Node(item);
    rear = newNode;
    if(front == null){
        front = newNode;
    }else{
        Node temp = front;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = newNode;
    }
 }

 public static int peek(){
    if(front != null){
        return front.data;
    }
    else{
        System.out.println("Queue is Empty");
        return 0;
    }
 }
 public static boolean isEmpty(){
    return (front == null);
 }
}
class lab4Ex4{
    public static void main(String args[]){
        Queue q = new Queue();
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.enqueue(4);
       
        System.out.println("Front element is " + q.peek());
       
        q.dequeue();
        q.dequeue();
        q.dequeue();
        q.dequeue();
        if(q.isEmpty()){
            System.out.print("Queue is empty");
            }else {
            System.out.print("Queue is not empty");
        }
    }
    
}
