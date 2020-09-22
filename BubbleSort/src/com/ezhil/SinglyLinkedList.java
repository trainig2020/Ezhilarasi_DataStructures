package com.ezhil;



public class SinglyLinkedList {

	
	public static void main(String[] args) {
		
		 BubbleSorting sList = new BubbleSorting();  
         
	        
	        sList.addNode(9);  
	        sList.addNode(7);  
	        sList.addNode(2);  
	        sList.addNode(5);  
	        sList.addNode(4);  
	          
	         
	        System.out.println("Original list: ");  
	        sList.display();  
	          
	          
	        sList.sortList();  
	          
	         
	        System.out.println("Sorted list: ");  
	        sList.display();  
	    }  
	}


