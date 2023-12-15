package com.anand.stringarray;

public class Stringtosearch {

	public static void main(String[] args) {
		String[] arr = {"This", "One", "Doing", "Hello", "Am", "I", "Hi", "Bye", "Rock", "Talk", "Toy"};
		String key = "Hello"; // String to search

		boolean found = false;

		// Linear search for the key string
		for (int i = 0; i < arr.length; i++) {
		    if (arr[i].equals(key)) {
		        found = true;
		        break;
		    }
		}

		if (found) {
		    System.out.println("Element found");
		} else {
		    System.out.println("Element not found");
		}
}
}