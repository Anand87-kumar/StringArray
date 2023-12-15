package com.anand.stringarray;

public class SplitWord {

    public static void main(String[] args) {
        String str = "this one doing hello am i hi bye rock talk toy";
        String[] words = str.split(" "); // Split the string into an array of words

        for (String word : words) {
            if (word.length() % 2 == 0) { // Check if the length of the word is even
                System.out.println(word);
            }
        }
    }
}

