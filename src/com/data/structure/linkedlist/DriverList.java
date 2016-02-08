package com.data.structure.linkedlist;

public class DriverList {

	public static void main(String[] args) {
		
		ILinkedList l = new LinkedListDemo();
		
		l.remove();
		
		l.addAtEnd("Year 1987");
		
		System.out.println(l);
		
		l.remove();
		System.out.println(l);

	}

}
