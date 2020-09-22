package com.ezhil;

import com.ezhil.MergeList.Node;

public class MergeList {

	class Node {
		int data;
		Node next;

		Node(int d) {
			data = d;
			next = null;
		}
	}

	  Node head ;
	public void addToTheLast(Node node) {
		
		if (head == null) {
			head = node;
		} else {
			Node temp = head;
			while (temp.next != null)
				temp = temp.next;
			temp.next = node;
		}
	}

	
	public void printList() {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
		System.out.println();
	}

}
 class Gfg
{
public Node SortedMerge(Node A, Node B) {

	if (A == null)
		return B;
	if (B == null)
		return A;

	if (A.data < B.data) {
		A.next = SortedMerge(A.next, B);
		return A;
	} else {
		B.next = SortedMerge(A, B.next);
		return B;
	}

}
}
