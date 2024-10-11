class Queue { 
     int arr[]; 
     int front; 
     int rear; 
     int capacity; 
     int count;    
    Queue(int size) 
    { 
        arr = new int[size]; 
        capacity = size; 
        front = 0; 
        rear = 0; 
        count = 0; 
    }    
    public void dequeue() 
    {  
        if(isEmpty()){
            System.out.println("Queue Underflow");
            return;        } 
        System.out.println("Removing :"+arr[front]);
        front=(front+1)%capacity;
        count--;
    }  
    public void enqueue(int item) 
    {
          if(isFull()){
           System.out.println("Queue overflow");
           return;
          }  
          System.out.println("Inserting :"+item);
            arr[rear]=(rear+1)%capacity;
            count++;  }
    public int peek() 
    { 
        if(isEmpty()){
            System.out.println("Queue is empty");
        return-1;
        }  
        return arr[front];    }  
    public int size() 
    {   
    return count;} 
    public Boolean isEmpty() 
    { 
        return count==0;     }    
    public Boolean isFull() 
    {
        return count==capacity;       } } 
 
class Lab4Ex3{ 
    public static void main (String[] args) 
    {  
        Queue q = new Queue(5); 
        q.enqueue(1); 
        q.enqueue(2); 
        q.enqueue(3); 
        System.out.println("Front element is: " + q.peek()); 
        q.dequeue(); 
        if(q.peek()!=0){
        System.out.println("Front element is: " + q.peek());} 
        System.out.println("Queue size is " + q.size()); 
        q.dequeue(); 
        q.dequeue(); 
        if (q.isEmpty()) 
            System.out.println("Queue Is Empty"); 
        else 
            System.out.println("Queue Is Not Empty"); 
    } 
} 