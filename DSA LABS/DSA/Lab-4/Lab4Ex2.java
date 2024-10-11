class Node 
{    int data;       // integer data   
    Node next;      // pointer to the next node   
  Node (int data){
    this.data=data;
    this.next=null;
  }}
class Stack 
{ 
     Node top; 
    public Stack() { 
        this.top = null; }  
    public void push(int x) // insert at the beginning   
    {  
        Node newNode=new Node(x);
            newNode.data=x;
            newNode.next=top;
            top=newNode;
        System.out.println("Inserting"+x);  }  
    public boolean isEmpty() 
    {  
         return (top==null);}
     public int peek() 
     { 
         if(isEmpty()){
            System.out.println("Stack is empty");
            return 0;
         }  
         return top.data; 
     }  
     public int pop() // remove at the beginning   
     { 
                 if(isEmpty()){
            System.out.println("Stack underFlow");
            return 0;
         }
         System.out.println("Removing :"+top.data);
         int temp=peek();
         top=top.next;
         return temp;
     } 
 } 

public class Lab4Ex2 { 
     public static void main(String[] args) 
     { 
         Stack stack = new Stack(); 
         stack.push(1); 
         stack.push(2); 
         stack.push(3); 
         System.out.println("Top element is " +  stack.peek()); 
         stack.pop(); 
         stack.pop(); 
         stack.pop(); 
         if (stack.isEmpty()) { 
             System.out.print("Stack is empty"); 
         } else { 
             System.out.print("Stack is not empty"); 
         } 
     } 
 } 