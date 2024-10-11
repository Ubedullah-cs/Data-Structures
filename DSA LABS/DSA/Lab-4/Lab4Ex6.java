class Stack {
    Queue q1, q2; 
   Stack(){
       q1 = new Queue();
       q2 = new Queue();    } 
   void push(int data){
       q1.enqueue(data);    } 

  int pop(){
   while(q1.top != null){
       q2.enqueue(q1.dequeue());
   }

   int temp = q2.dequeue();
   
   while(q2.top != null){
       q1.enqueue(q2.dequeue());
   }
   return temp;   }}
class lab4Ex6{
   public static void main(String args[]){
       Stack q = new Stack();
       q.push(2);
       q.push(4);
       q.push(5);
       q.push(6);
       System.out.println(q.pop());
       System.out.println(q.pop());
       System.out.println(q.pop());       
   }
   
}


























