class Stack 
{ 
    int arr[]; 
    int top; 
    int capacity; 
    Stack(int size) 
    { 
        arr = new int[size]; 
        capacity = size; 
        top = -1; 
    }    
    public void push(int x) 
    { 
        if(isFull()){
            System.out.println("Stack is overflow"+x);
        }
        System.out.println("Inserting :"+x);
        arr[++top]=x;    
    } 
 public int pop() 
    { 
         if(isEmpty()){
            System.out.println("Stack is underflow");
            return -1;       }
        System.out.println("Removing :"+top);
       return arr[top--];          
    }  
    public int peek() 
    { 
      if(isEmpty()){  
    System.out.println("Stack is Empty");}
    return arr[top]; }      
    public int size() 
    {  
        return top+1;   
    } 
    public Boolean isEmpty() 
    {   
        return top==-1; 
    }  
    public Boolean isFull() 
    { 
        return top==capacity-1;   
    } 
 
    public static void main (String[] args) 
    { 
        Stack stack = new Stack(3); 
        stack.push(1);      // Inserting 1 in the stack   
        stack.push(2);      // Inserting 2 in the stack   
        stack.pop();        // removing the top 2   
        stack.pop();        // removing the top 1   
        stack.push(3);      // Inserting 3 in the stack   
        System.out.println("Top element is: " + stack.peek()); 
        System.out.println("Stack size is :" + stack.size()); 
        stack.pop();        // removing the top 3   
        // check if stack is empty   
        if (stack.isEmpty())
        System.out.println("Stack Is Empty");
        else      
            System.out.println("Stack Is Not Empty");
    }}