package com.data.structure.linkedlist;

public interface ILinkedList {

	//Add Elements to Linked List
	public void add(int index, Object element);
	public void addFirst(Object o);
	public void addLast(Object o);

	// Set an element at a given index with a given element
	public void set(int index, Object element);

	//Clean the Linked List
	public void clear();

	//Check if an element exists in a Linked List
	public boolean contains(Object o);

	// Get methods
	public Object get(int index);
	public Object getFirst();
	public Object getLast();

	//Find the index of a given element
	public int indexOf(Object o);
	public int lastIndexOf(Object o);

	// Remove Elements
	public Object remove(int index);
	public boolean remove(Object o);
	public Object removeFirst();
	public Object removeLast();


	public int size();
	public void peek();
}
