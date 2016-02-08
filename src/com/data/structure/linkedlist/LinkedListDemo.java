package com.data.structure.linkedlist;

public class LinkedListDemo implements ILinkedList {

	Node head = null;
	
	

	@Override
	public String toString() {
		return "LinkedListDemo [head=" + head.data + "]";
	}

	@Override
	public void peek() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

	

	@Override
	public void add(int index, Object element) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addFirst(Object o) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addLast(Object o) {
		// TODO Auto-generated method stub
		if(head == null){
			head = new Node(o, null);
		}
		
		Node current = head;
		
		while(current.next != null){
			current = current.next;
		}// Current now points to the LAST node
		
		current.next = new Node(o, null);
		
	}

	@Override
	public void set(int index, Object element) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean contains(Object o) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Object get(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object getFirst() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object getLast() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int indexOf(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int lastIndexOf(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Object remove(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean remove(Object o) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Object removeFirst() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object removeLast() {
		// TODO Auto-generated method stub
		if (this.head == null){
			System.out.println("List is Already EMPTY");
			return null;
		}
		
		if(this.head.next == null){
			head = null;
		}
		
		Node current = this.head;
		
		while (current.next.next != null){
			current = current.next;
		}// Reached to the second last node
		
		current.next = null;
		return null;
	}
	
	
	
}
