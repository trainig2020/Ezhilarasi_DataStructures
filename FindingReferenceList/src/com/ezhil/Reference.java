package com.ezhil;

public class Reference {
	class Node{  
        int data;  
        Node next;  
        public Node(int data) {  
            this.data = data;  
            this.next = null;  
        }  
    }  
	
	public Node head = null;  
    public Node tail = null;  
    
	
    
    public Node findReference(Node head,Node node) {
    	Node current = head;
    	if(node == head) {
			System.out.println("No reference for head node");
		}
    	while(current.next !=null) {
    		
    		if(current.next == node ) {
    			System.out.println("Reference of given node is : "+current.data);
    			return current;
    		}
    		else {
    			current = current.next;
    		}
    	}
    	
		return null;
		
    	
    }

}
