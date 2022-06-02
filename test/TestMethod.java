package com.lazarus.dataStructure.vector.test;

import com.lazarus.dataStructure.vector.Vector;

public class TestMethod {

	public static void main(String[] args) {

		Vector vector = new Vector(11);
		try {
			vector.AddElementSize("Element one");
			vector.AddElementSize("Element two");
			vector.AddElementSize("Element three");
			vector.AddElementSize("Element four");
			vector.AddElementSize("Element five");
			vector.AddElementSize("Element six");
			vector.AddElementSize("Element seven");
			vector.AddElementSize("Element eight");
			vector.AddElementSize("Element nine");
			vector.AddElementSize("Element ten");
			vector.AddElementSize("Element eleven");
			vector.AddElementSize("Element twelve");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
