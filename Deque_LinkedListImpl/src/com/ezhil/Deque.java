package com.ezhil;

import java.util.NoSuchElementException;

class Deque
{
    private Node front, rear;
    private int size;
 
    /* Constructor */
    public Deque()
    {
        front = null;
        rear = null;
        size = 0;
    }    
    /*  Function to check if queue is empty */
    public boolean isEmpty()
    {
        return front == null;
    }    
    /*  Function to get the size of the queue */
    public int getSize()
    {
        return size;
    }
    /* Clear dequeue */
    public void clear()
    {
        front = null;
        rear = null;
        size = 0;
    }
    /*  Function to insert an element at begining  */
    public void insertAtFront(int val)
    {
        Node nptr = new Node(val, null);    
        size++ ;    
        if (front == null) 
        {
            front = nptr;
            rear = front;
        }
        else 
        {
            nptr.setNext(front);
            front = nptr;
        }
    }
    /*  Function to insert an element at end  */
    public void insertAtRear(int val)
    {
        Node nptr = new Node(val,null);    
        size++ ;    
        if (rear == null) 
        {
            rear = nptr;
            front = rear;
        }
        else 
        {
            rear.setNext(nptr);
            rear = nptr;
        }
    }    
    /*  Function to remove front element from the queue */
    public int removeAtFront()
    {
        if (isEmpty() )
            throw new NoSuchElementException("Underflow Exception");
        Node ptr = front;
        front = ptr.getNext();
 
        if (front == null)
            rear = null;
        size-- ;
 
        return ptr.getData();
    }
    /*  Function to remove rear element from the queue */
    public int removeAtRear()
    {
        if (isEmpty() )
            throw new NoSuchElementException("Underflow Exception");
        int ele = rear.getData();
        Node s = front;
        Node t = front;
        while (s != rear)
        {
            t = s;
            s = s.getNext();
        }
        rear = t;
        rear.setNext(null);
        size --;
 
        return ele;
    }        
    /*  Function to check the front element of the queue */
    public int peekAtFront()
    {
        if (isEmpty() )
            throw new NoSuchElementException("Underflow Exception");
        return front.getData();
    }
    /*  Function to check the front element of the queue */
    public int peekAtRear()
    {
        if (isEmpty() )
            throw new NoSuchElementException("Underflow Exception");
        return rear.getData();
    }    
    /*  Function to display the status of the queue */
    public void display()
    {
        System.out.print("\nDequeue = ");
        if (size == 0)
        {
            System.out.print("Empty\n");
            return ;
        }
        Node ptr = front;
        while (ptr != rear.getNext() )
        {
            System.out.print(ptr.getData()+" ");
            ptr = ptr.getNext();
        }
        System.out.println();        
    }
}