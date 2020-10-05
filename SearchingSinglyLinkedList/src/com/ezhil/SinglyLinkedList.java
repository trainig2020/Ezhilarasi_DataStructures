package com.ezhil;

import java.util.Scanner;

import com.ezhil.SearchList.Node;

public class SinglyLinkedList {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		SearchList list = new SearchList();
		Scanner sc = new Scanner(System.in);
		
		
		while(true)
        {
			System.out.println("\n****************");
			System.out.println("1. Insert Elements");
            System.out.println("2. Linear Search");
            System.out.println("3. Binary Search");
            System.out.println("4. Exit");
            
            System.out.println("\n Enter your choice");
            int choice = sc.nextInt();            
            switch (choice) {
            case 1:
            	System.out.println("Enter Element to Insert :");
            	list.addNode(sc.nextInt());
            	list.display();
            	break;

            case 2:
            	
            	System.out.println("Enter the element for  Linear Search : ");
        		int input = sc.nextInt(); 
        		list.linearSearch(input); 
        		break;
            case 3:
            	
            	System.out.println("Enter Element for  Binary Search ");
				
				int input1 = sc.nextInt();
				Node search = SearchList.binarySearch(list.head, input1);
				if(search == null) {
					System.out.println("Element is Not Present");
				}
				else {
					System.out.println("Element is Present");
				}
				break;

            case 4:
            	System.out.println("Exiting....");
            	System.exit(0);
            default : 
                System.out.println("Wrong Entry \n ");
                break; 
			
            }
            
            
            }
		
		 
          
         

        
        
         

	}

}
