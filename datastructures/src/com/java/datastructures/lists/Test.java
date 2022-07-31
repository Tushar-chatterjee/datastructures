package com.java.datastructures.lists;

public class Test {

	public static void main(String[] args) {

		Employee employee = new Employee("tushar", 1);
		Employee employee1 = new Employee("ranbir", 2);
		Employee employee2 = new Employee("cristiano", 3);
		Employee employee3 = new Employee("tom", 4);

		EmployeeLinkedList list = new EmployeeLinkedList();
		list.addToFront(employee3);
		list.addToFront(employee2);
		list.addToFront(employee1);
		list.addToFront(employee);

		list.printList();
		System.out.println(list.getSize());
		System.out.println("================");
		list.removeFromFront();
		list.printList();
		System.out.println(list.getSize());
	}

}
