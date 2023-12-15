package com.anand.stringarray;

public class PrintAllStringEvenlength {

    public static void main(String[] args) {
        String[] words = {"this", "one", "doing", "hello", "am", "i", "hi", "bye", "rock", "talk", "toy"};

        for (String word : words) {
            if (word.length() % 2 == 0) {
                System.out.println(word);
            }
        }
    }
}
