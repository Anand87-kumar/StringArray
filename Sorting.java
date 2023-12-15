package com.anand.stringarray;

import java.util.Arrays;

public class Sorting {

	public static void main(String[] args) {

		String[] arr = {"This", "One", "Doing", "Hello", "Am", "I", "Hi", "Bye", "Rock", "Talk", "Toy"};

		// Sorting the array in ascending order
		Arrays.sort(arr);

		// Printing sorted strings
		for (String str : arr) {
		    System.out.println(str);
		}
}
}