package com.anand.stringarray;

public class EndsWith_ING {

    public static void main(String[] args) {
        String str = "This One Doing Hello Am I Hi Bye Rock Talk Toy";
        String[] words = str.split(" ");

        for (String word : words) {
            if (word.toLowerCase().endsWith("ing")) {
                System.out.print(word + " ");
            }
        }
    }
}

