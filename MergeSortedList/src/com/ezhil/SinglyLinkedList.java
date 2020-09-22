package com.ezhil;

public class SinglyLinkedList {

	
	public static void main(String[] args) {
		
		MergeList llist1 = new MergeList();
	    MergeList llist2 = new MergeList();
	    
	     
	    // Node head1 = new Node(5);
	  
	    
	    llist1.addToTheLast(llist1.new Node(5));
	    llist1.addToTheLast(llist1.new Node(10));
	    llist1.addToTheLast(llist1.new Node(15));
	     
	    // Node head2 = new Node(2);
	    llist2.addToTheLast(llist2.new Node(2));
	    llist2.addToTheLast(llist2.new Node(3));
	    llist2.addToTheLast(llist2.new Node(20));
	     
	     
	    llist1.head = new Gfg().SortedMerge(llist1.head, 
	                                        llist2.head);
	    System.out.println("Merging of two sorted list:");
	    llist1.printList(); 
	    }  
	}


