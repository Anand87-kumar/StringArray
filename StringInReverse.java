package com.anand.stringarray;

public class StringInReverse {

    public static void main(String[] args) {
        String[] arr = {"This", "One", "Doing", "Hello", "Am", "I", "Hi", "Bye", "Rock", "Talk", "Toy"};

        for (int i = 0; i < arr.length; i++) {
            String s = arr[i];
            String rev = "";
            for (int j = s.length() - 1; j >= 0; j--) {
                char c = s.charAt(j);
                rev = rev + c;
            }
            System.out.println(rev);
        }
    }
}

