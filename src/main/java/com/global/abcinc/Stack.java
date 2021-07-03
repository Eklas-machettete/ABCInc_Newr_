package com.global.abcinc;


class Stack
{
    private String arr[];
    private int front;
    private int c;
    Stack(int size)
    {
        arr = new String[size];
        c = size;
        front = -1;
    }
 
     public void push(String x)
    {
        if (isFull())
        {
            System.out.println("Stack Overflow");
            System.exit(1);
        }
 
        System.out.println("Insert " + x);
        arr[++front] = "insert"+x;
    }
 
  
    public String pop()
    {
       
        if (isEmpty())
        {
            System.out.println(" StackUnderflow");
            System.exit(1);
        }
 
        System.out.println("Removing " + peek());
 
        
        return arr[front--];
    }
 
    public String peek()
    {
        if (!isEmpty()) {
            return arr[front];
        }
        else {
            System.exit(1);
        }
 
        return "-1";
    }
 
   
    public int size() {
        return front + 1;
    }
 
    
    public Boolean isEmpty()
    {
        return front == -1;              
    }
 
  
    public Boolean isFull() {
        return front == c - 1;    
    }

	
}