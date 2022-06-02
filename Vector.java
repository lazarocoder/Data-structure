
package com.lazarus.dataStructure.vector;

public class Vector {

	private String[] elements;
	private Integer size;

	/**
	 * Instantiates a new vector.
	 *
	 * @param capacity the capacity
	 */
	/* constructor */
	public Vector(int capacity) {
		this.elements = new String[capacity];
		this.size = 0;
	}

	/**
	 * Adds the element size.
	 *
	 * @param element the element
	 * @return true, if successful
	 */
	/* method with arguments */
	public boolean AddElementSize(String element) {

		if (this.size < this.elements.length) {
			this.elements[this.size] = element;
			this.size++;
			return true;
		} else {
			return false;
		}

	}

	/**
	 * Find.
	 *
	 * @param position the position
	 * @return the string
	 */
	/* find the position in array */
	public String find(int position) {
		if (!(position >= 0 && position < size)) {
			throw new IllegalArgumentException("This position is not valid!");
		}

		return this.elements[position];
	}

	public int getSize() {
		return this.size;

	}

	/**
	 * To string.
	 *
	 * @return the string
	 */
	/* @cacatenate in array */
	@Override
	public String toString() {
		StringBuilder s = new StringBuilder();
		s.append("[");
		for (int i = 0; i < this.size - 1; i++) {
			s.append(this.elements[i]);
			s.append(",");

		}

		if (this.size > 0) {
			s.append("]");
		}

		/* return Arrays.toString(elements); */
		return s.toString();
	}

	/* Unused methods */
	
	/*
	 * public void addElement(String element) {
	 * 
	 * for (int i = 0; i < this.elements.length; i++) { 
	 * 	if (this.elements[i] ==null) { 
	 * 	this.elements[i] = element; 
	 * 	break; 
	 * }
	 * 
	 * }
	 * 
	 * }
	 * public void AddElementSize(String element) throws Exception {
	 * 
	 * if (this.size < this.elements.length) { 
	 * 	this.elements[this.size] = element;
	 * 	this.size++;
	 * 
	 * } else { 
	 * throw new Exception("The vector is not empty!"); 
	 * }
	 * 
	 * }
	 * public String find(int position) { 
	 * 	return this.elements[position];
	 * 
	 * }
	 */
}
