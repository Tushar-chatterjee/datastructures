package com.java.datastructures.lists;

public class EmployeeDoublyLinkedList {

	private EmpolyeeNodeDoubly head;
	private EmpolyeeNodeDoubly tail;
	private int size;

	public void insertAtHead(Employee employee) {

		EmpolyeeNodeDoubly node = new EmpolyeeNodeDoubly(employee);
		node.setNext(head);
		if (head == null) {
			tail = node;
		} else {
			head.setPrevious(node);
		}
		// not to worry about new node previous field; since it would be null

		head = node;

		size++;
	}
	
	public void insertAtHeadMine(Employee employee) {

		EmpolyeeNodeDoubly node = new EmpolyeeNodeDoubly(employee);
		node.setNext(head);
		node.setPrevious(head.getPrevious());
		head.setPrevious(node);
		head = node;

		size++;
	}

	public void insertAtTail(Employee employee) {
		EmpolyeeNodeDoubly node = new EmpolyeeNodeDoubly(employee);
		if (tail == null) {
			head = node;
		} else {
			tail.setNext(node);
			node.setPrevious(tail);
		}
		// not to worry about new node next field; since it would be null

		tail = node;

		size++;

	}

	public EmpolyeeNodeDoubly removeFromHead() {
		if (size == 0) {
			return null;
		}

		EmpolyeeNodeDoubly removedNode = head;

		if (head.getNext() == null) {
			tail = null;
		} else {
			head.getNext().setPrevious(null);
		}

		head = head.getNext();
		size--;
		removedNode.setNext(null);

		return removedNode;

	}

	public void insertAtTailMine(Employee employee) {
		EmpolyeeNodeDoubly node = new EmpolyeeNodeDoubly(employee);
		node.setPrevious(tail);
		node.setNext(head.getNext());
		tail.setNext(node);
		tail = node;

		size++;

	}

	public EmpolyeeNodeDoubly removeFromHeadMine() {
		if (size == 0) {
			return null;
		}

		EmpolyeeNodeDoubly removedNode = head;
		head.setPrevious((removedNode.getPrevious()));

		head = removedNode.getNext();

		removedNode.setNext(null);
		size--;
		return removedNode;

	}

	public EmpolyeeNodeDoubly removeFromTailMine() {
		if (size == 0) {
			return null;
		}

		EmpolyeeNodeDoubly removedNode = tail;
		tail.getPrevious().setNext(removedNode.getNext());
		tail = removedNode.getPrevious();
		size--;
		return removedNode;
	}

	public void printList() {

		EmpolyeeNodeDoubly current = head;
		System.out.print("HEAD--> ");
		while (current != null) {
			System.out.print(current + " <==> ");
			current = current.getNext();
		}
		System.out.println("null");
	}

}
