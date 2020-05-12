package com.twc.javaBasic.Exercise.stringReverser;

public class StringReverser {
    public static String[] reverse(String input) {
        if (input == null) {
            throw new IllegalArgumentException("input cannot be null!");
        }
        if (( (input == "") | (input == "   ") )){
            String[] modifiedinput = new String[0];
            return modifiedinput;
        }
        String[] modifiedinput = input.split(" ");

        for (int start = 0, end = modifiedinput.length - 1; start < end; start++, end--) {
            String temp = modifiedinput[end];
            modifiedinput[end] = modifiedinput[start];
            modifiedinput[start] = temp;
        }

        return modifiedinput;
    }
}