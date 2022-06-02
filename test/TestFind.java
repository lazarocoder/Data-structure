package com.lazarus.dataStructure.vector.test;

import com.lazarus.dataStructure.vector.Vector;

public class TestFind {

	public static void main(String[] args) {
		Vector vector = new Vector(10);

		vector.AddElementSize("Element one");
		vector.AddElementSize("Element two");
		vector.AddElementSize("Element three");

		System.out.println(vector.find(15));

	}

}
