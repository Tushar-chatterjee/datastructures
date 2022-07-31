package com.java.datastructures.lists;

public class EmployeeLinkedList {

	private EmployeeNode head;
	private int size;

	public void addToFront(Employee employee) {

		EmployeeNode node = new EmployeeNode(employee);
		node.setNext(head);
		head = node;
		size++;

	}

	public void removeFromFront() {

		EmployeeNode removedNode = head;
		head = removedNode.getNext();
		size--;
		removedNode.setNext(null);

	}

	public int getSize() {
		return size;
	}

	public void printList() {

		EmployeeNode current = head;
		System.out.print("HEAD--> ");
		while (current != null) {
			System.out.print(current + " --> ");
			current = current.getNext();
		}
		System.out.println("null");
	}
}
