package com.ezhil;
class LinkedList
{
    protected Node start, end;
    public int size;
    public LinkedList()
    {
        start = null;
        end = null;
        size = 0;
    }
    /*  Function to check if list is empty  */
    public boolean isEmpty()
    {
        return start == null;
    }
    /*  Function to check size of list  */
    public int getSize()
    {
        return size;
    }    
    /*  Function to insert an element  */
    public void insert(int val)
    {
        Node nptr, ptr, tmp = null;
        nptr = new Node(val, null);
        boolean ins = false;
        if (start == null)
        {
            start = nptr;
            nptr.setNext(start);
            end = start;
        }
        else if (val <= start.getData())
        {
            nptr.setNext(start);
            end.setNext(nptr);
            start = nptr;
        }
        else if (val >= end.getData())
        {
            end.setNext(nptr);
            nptr.setNext(start);
            end = nptr;
        }
        else
        {
            tmp = start;
            ptr = start.getNext();
            while (tmp != end)
            {
                if (val >= tmp.getData() && val <= ptr.getData())
                {
                    tmp.setNext(nptr);
                    nptr.setNext(ptr);
                    ins = true;
                    break;
                }
                else
                {
                    tmp = ptr;
                    ptr = ptr.getNext();
                }
            }
            if (ins == false)
            {
                tmp.setNext(nptr);
            }
        }
        size++;
    }
    /*  Function to delete an element at position  */
    public void deleteAtPos(int pos)
    {        
        if (pos == 1 && size == 1)
        {
            start = null;
            end = null;
            size = 0;
            return;
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
            Node ptr = start;
 
            for (int i = 1; i < size - 1; i++)
                ptr = ptr.getNext();
            ptr.setNext(start);
            end = ptr;            
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
    /*  Function to display elements  */
    public void display()
    {
        System.out.print("Sorted Circular Singly Linked List = ");
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