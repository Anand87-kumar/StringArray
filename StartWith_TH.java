package com.anand.stringarray;

public class StartWith_TH {

    public static void main(String[] args) {
        String str = "This is one doing hello am i hi bye rock talk toy";
        String[] words = str.split(" ");

        for (String word : words) {
            if (word.startsWith("Th")) {
                System.out.print(word + " ");
            }
        }
    }
}

