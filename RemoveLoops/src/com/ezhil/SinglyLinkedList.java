package com.ezhil;

import com.ezhil.LoopFinding.ListNode;

public class SinglyLinkedList {

	
	public static void main(String[] args) {
		 LoopFinding loop = new LoopFinding();
		 
		 
		ListNode head = loop.new ListNode(2);
		
	    ListNode l1 = loop.new ListNode(8);
	    head.next = l1;
	    
	    ListNode l2 = loop.new ListNode(3);   
	    l1.next = l2;
	    
	    ListNode l3 = loop.new ListNode(5);
	    l2.next = l3;
	    
	    ListNode l4 = loop.new ListNode(10);
	    l3.next = l4;
	    
	    l4.next = l2;

	        
	    
	    loop.removeLoop(head);
	    while (head != null) {
	      System.out.print(head.val + " ");
	      head = head.next;
	    }
	    System.out.println("NULL");
        
         

	}

}
