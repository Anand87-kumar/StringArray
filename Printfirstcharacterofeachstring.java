package com.anand.stringarray;

public class Printfirstcharacterofeachstring {

	public static void main(String[] args) {
		String str = "This One Doing Hello Am I Hi Bye Rock Talk Toy";
		String[] words=str.split("");
		
		for(String word:words) {
		if(!word.isEmpty()) {
			System.out.print(word.charAt(0));
		}
		}
	}

}
