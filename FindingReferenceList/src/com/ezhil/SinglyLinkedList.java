package com.ezhil;

import com.ezhil.Reference.Node;

public class SinglyLinkedList {

	public static void main(String[] args) {
		Reference list = new Reference();
		
		Node head = list.new Node(10);
		 Node first = list.new Node(20);
		 Node second = list.new Node(30);
		 Node third = list.new Node(45);
       
		 head.next=first;
		 first.next=second;
		 second.next=third;
		 
			/*
			 * list.addNode(1); list.addNode(2); list.addNode(3); list.addNode(4);
			 */ 
		
		list.findReference(head,first);
		

	}

}
