package com.anand.stringarray;

public class SwapTheFirstAndLastCharacterOfEachString {

    public static void main(String[] args) {
        String str = "This One Doing Hello Am I Hi Bye Rock talk Toy";
        String[] words = str.split(" ");

        for (String word : words) {
            if (word.length() > 1) {
                char firstChar = word.charAt(0);
                int len = word.length();
                char lastChar = word.charAt(len - 1);
                String middle = word.substring(1, len - 1);
                System.out.print(lastChar + middle + firstChar + " ");
            } else {
                System.out.print(word + " ");
            }
        }
    }
}
