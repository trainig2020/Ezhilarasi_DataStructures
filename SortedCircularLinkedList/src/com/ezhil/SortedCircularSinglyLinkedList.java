package com.ezhil;

import java.util.Scanner;

public class SortedCircularSinglyLinkedList
{
    public static void main(String[] args)
    {             
        Scanner scan = new Scanner(System.in);
        LinkedList list = new LinkedList(); 
                
        
        while(true)
        {
            System.out.println("\nSorted Circular Singly Linked List Operations\n");
            System.out.println("1. insert");
            System.out.println("2. delete at position");
            System.out.println("3. check empty");
            System.out.println("4. get size");
            System.out.println("5. Exit");
 
            System.out.println("\n Enter your choice : ");
            int choice = scan.nextInt();            
            switch (choice)
            {
            case 1 : 
                System.out.println("Enter integer element to insert");
                list.insert( scan.nextInt() );                     
                break;                          
            case 2 : 
                System.out.println("Enter position");
                int p = scan.nextInt() ;
                if (p < 1 || p > list.getSize() )
                    System.out.println("Invalid position\n");
                else
                    list.deleteAtPos(p);
                break;
            case 3 : 
                System.out.println("Empty status = "+ list.isEmpty()+"\n");
                break;                   
            case 4 : 
                System.out.println("Size = "+ list.getSize() +" \n");
                break; 
            case 5:
            	System.out.println("Exiting....");
            	System.exit(0);
            default : 
                System.out.println("Wrong Entry \n ");
                break;   
            }
            /*  Display List  */ 
            list.display();
                      
 
        }            
    }
}