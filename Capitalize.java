package com.anand.stringarray;

public class Capitalize {

    public static void main(String[] args) {
        String str = "this one doing hello am i hi bye rock talk toy";
        String[] words = str.split(" ");

        for (String word : words) {
            char firstChar = word.charAt(0);
            firstChar = Character.toUpperCase(firstChar);
            String restOfWord = word.substring(1);
            System.out.print(firstChar + restOfWord + " ");
        }
    }
}
