package com.ezhil;

public class SearchList {

	class Node {
		int data;
		Node next;

		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}

	public Node head = null;
	public Node tail = null;
	int size = 0;

	public void addNode(int data) {

		Node newNode = new Node(data);

		if (head == null) {

			head = newNode;
			tail = newNode;
		} else {

			tail.next = newNode;

			tail = newNode;
		}
		size++;
	}

	public void linearSearch(int data) {
		Node current = head;
		int i = 1;
		boolean flag = false;

		if (head == null) {
			System.out.println("List is empty");
		} else {
			while (current != null) {

				if (current.data == data) {
					flag = true;
					break;
				}
				i++;
				current = current.next;
			}
		}
		if (flag)
			System.out.println("Element is present in the list at the position : " + i);
		else
			System.out.println("Element is not present in the list");
	}

	public static Node middleNode(Node start, Node last) {
		if (start == null)
			return null;

		Node slow = start;
		Node fast = start.next;

		while (fast != last) {
			fast = fast.next;
			if (fast != last) {
				slow = slow.next;
				fast = fast.next;
			}
		}
		return slow;
	}

	public static Node binarySearch(Node head, int value) {
		Node start = head;
		Node last = null;

		do {
			// Find Middle
			Node mid = middleNode(start, last);

			// If middle is empty
			if (mid == null)
				return null;

			// If value is present at middle
			if (mid.data == value)
				return mid;

			// If value is less than mid
			else if (mid.data < value) {
				start = mid.next;
			}

			// If the value is more than mid.
			else
				last = mid;
		} while (last == null || last != start);

		// value not present
		return null;
	}

	public void display() {

		Node current = head;
		if (head == null) {
			System.out.println("List is empty");
			return;
		}
		while (current != null) {

			System.out.print(current.data + " ");
			current = current.next;
		}
		System.out.println();
	}

}
