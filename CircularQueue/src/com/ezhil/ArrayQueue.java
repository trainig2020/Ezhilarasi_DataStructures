package com.ezhil;

import java.util.NoSuchElementException;

class ArrayQueue
{
    protected int Queue[] ;
    protected int front, rear, size, len;
 
    /* Constructor */
    public ArrayQueue(int n) 
    {
        size = n;
        len = 0;
        Queue = new int[size];
        front = -1;
        rear = -1;
    }    
    /*  Function to check if queue is empty */
    public boolean isEmpty() 
    {
        return front == -1;
    }    
    /*  Function to check if queue is full */
    public boolean isFull() 
    {
        return front==0 && rear == size -1 ;
    }    
    /*  Function to get the size of the queue */
    public int getSize()
    {
        return len ;
    }    
    /*  Function to check the front element of the queue */
    public int peek() 
    {
        if (isEmpty())
           throw new NoSuchElementException("Underflow Exception");
        return Queue[front];
    }    
    /*  Function to insert an element to the queue */
    public void insert(int data) 
    {
        
        if (rear + 1 >= size)
            throw new IndexOutOfBoundsException("Overflow Exception");
        if (front == -1)
            front = 0;
          rear = (rear + 1) % size;
          Queue[rear] = data;
        len++ ;    
    }    
    /*  Function to remove front element from the queue */
    public int remove() 
    {
        if (isEmpty())
           throw new NoSuchElementException("Underflow Exception");
        else 
        {
            len-- ;
            int ele = Queue[front];
            if ( front == rear) 
            {
                front = -1;
                rear = -1;
            }
            else
                front++;                
            return ele;
        }        
    }
    /*  Function to display the status of the queue */
    public void display()
    {
    	int i;
        System.out.print("\nQueue = ");
        if (len == 0)
        {
            System.out.print("Empty\n");
            return ;
        }
        for ( i = front;i!=rear; i = (i + 1) % size)
            System.out.print(Queue[i]+" , ");
        System.out.println(Queue[i]);        
    }
}