package com.ezhil;

public class LoopFinding {
	class ListNode {
		  int val;
		  ListNode next;

		  ListNode(int x) {
		    val = x;
		    next = null;
		  }
		}
	
	public void removeLoop(ListNode head) {
	    
	    ListNode ptr1 = head;
	    ListNode ptr2 = head;
	    
	    boolean flag = false;
	    // Traverse the list until ptr2 or ptr2.next becomes null.
	    while (ptr2 != null && ptr2.next != null) {
	      // Move forward ptr1 by one node.
	      ptr1 = ptr1.next;
	      // Move forward ptr2 by two nodes.
	      ptr2 = ptr2.next.next;
	      // Check if ptr1 and ptr2 meet at some node, then there is a loop in the Linked
	      
	      if (ptr1 == ptr2) {
	        flag = true;
	        break;
	      }
	    }
	    // When there is a loop in the Linked List.
	    if (flag) {
	      // Assign head to ptr1.
	      ptr1 = head;
	      // Loop until next of ptr1 and ptr2 are not equal.
	      while (ptr1.next != ptr2.next) {
	        ptr1 = ptr1.next;
	        ptr2 = ptr2.next;
	      }
	      // Make next of ptr2 that is last node of Linked List NULL.
	      ptr2.next = null;
	    }

	  }

}
