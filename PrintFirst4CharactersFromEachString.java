package com.anand.stringarray;

public class PrintFirst4CharactersFromEachString {

    public static void main(String[] args) {
        String str = "This One Doing Hello Am I Hi Bye Rock Talk Toy";
        String[] words = str.split(" ");

        for (String word : words) {
            if (word.length() >= 4) {
                String firstFourChars = word.substring(0, 4);
                System.out.print(firstFourChars + " ");
            } else {
                System.out.print(word + " ");
            }
        }
    }
}
