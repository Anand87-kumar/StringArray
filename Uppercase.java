package com.anand.stringarray;

public class Uppercase {

	public static void main(String[] args) {
		String str = "This One Doing Hello Am I Hi Bye Rock Talk Toy";
		String[] words=str.split("");
		
		for(int i=0;i<words.length;i++) {
		    String s = words[i].toUpperCase();
			System.out.print(s);
		}
		}
	}

	


