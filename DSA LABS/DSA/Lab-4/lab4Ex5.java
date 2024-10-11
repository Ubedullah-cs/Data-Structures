class Queue {
     Stack s1, s2;
    public Object top; 
    Queue(){
        s1 = new Stack();
        s2 = new Stack();    } 
    void enqueue(int data){
        s1.push(data);    } 

   int dequeue(){
    while(s1.top != null){
        s2.push(s1.pop());
    }

    int temp = s2.pop();
    
    while(s2.top != null){
        s1.push(s2.pop());
    }
    return temp;   }}
class lab4Ex5{
    public static void main(String args[]){
        Queue q = new Queue();
        q.enqueue(2);
        q.enqueue(4);
        q.enqueue(5);
        q.enqueue(6);
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());       
    }
    
}
