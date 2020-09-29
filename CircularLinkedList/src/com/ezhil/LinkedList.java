package com.ezhil;
class LinkedList
{
    protected Node start ;
    protected Node end ;
    public int size ;
 
    /* Constructor */
    public LinkedList()
    {
        start = null;
        end = null;
        size = 0;
    }
    /* Function to check if list is empty */
    public boolean isEmpty()
    {
        return start == null;
    }
    /* Function to get size of the list */
    public int getSize()
    {
        return size;
    }
    /* Function to insert element at the begining */
    public void insertAtStart(int val)
    {
        Node nptr = new Node(val,null);    
        nptr.setNext(start);
        if(start == null)
        {            
            start = nptr;
            nptr.setNext(start);
            end = start;            
        }
        else
        {
            end.setNext(nptr);
            start = nptr;        
        }
        size++ ;
    }
    /* Function to insert element at end */
    public void insertAtEnd(int val)
    {
        Node nptr = new Node(val,null);    
        nptr.setNext(start);
        if(start == null)
        {            
            start = nptr;
            nptr.setNext(start);
            end = start;            
        }
        else
        {
            end.setNext(nptr);
            end = nptr;            
        }
        size++ ;
    }
    /* Function to insert element at position */
    public void insertAtPos(int val , int pos) 
    {
        Node nptr = new Node(val,null);                
        Node ptr = start;
        pos = pos - 1 ;
        for (int i = 1; i < size - 1; i++) 
        {
            if (i == pos) 
            {
                Node tmp = ptr.getNext() ;
                ptr.setNext( nptr );
                nptr.setNext(tmp);
                break;
            }
            ptr = ptr.getNext();
        }
        size++ ;
    }
    /* Function to delete element at position */
    public void deleteAtPos(int pos)
    {    
        if (size == 1 && pos == 1)
        {
            start = null;
            end = null;
            size = 0;
            return ;
        }        
        if (pos == 1) 
        {
            start = start.getNext();
            end.setNext(start);
            size--; 
            return ;
        }
        if (pos == size) 
        {
            Node s = start;
            Node t = start;
            while (s != end)
            {
                t = s;
                s = s.getNext();
            }
            end = t;
            end.setNext(start);
            size --;
            return;
        }
        Node ptr = start;
        pos = pos - 1 ;
        for (int i = 1; i < size - 1; i++) 
        {
            if (i == pos) 
            {
                Node tmp = ptr.getNext();
                tmp = tmp.getNext();
                ptr.setNext(tmp);
                break;
            }
            ptr = ptr.getNext();
        }
        size-- ;
    }
    /* Function to display contents */
    public void display()
    {
        System.out.print("\nCircular Singly Linked List = ");
        Node ptr = start;
        if (size == 0) 
        {
            System.out.print("empty\n");
            return;
        }
        if (start.getNext() == start) 
        {
            System.out.print(start.getData()+ "->"+ptr.getData()+ "\n");
            return;
        }
        System.out.print(start.getData()+ "->");
        ptr = start.getNext();
        while (ptr.getNext() != start) 
        {
            System.out.print(ptr.getData()+ "->");
            ptr = ptr.getNext();
        }
        System.out.print(ptr.getData()+ "->");
        ptr = ptr.getNext();
        System.out.print(ptr.getData()+ "\n");
    }
}