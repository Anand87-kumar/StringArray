package com.anand.stringarray;

public class Contains_And {

	  public static void main(String[] args) {
	        String str = "This One Doing Hello Am I Hi Bye Rock Talk Toy";
	        String[] words = str.split(" ");

	        for (String word : words) {
	            if (word.contains("Am")) {
	                System.out.print(word + " ");
	            }
	        }
	    }
	}