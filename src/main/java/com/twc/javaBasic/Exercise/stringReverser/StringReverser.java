package com.twc.javaBasic.Exercise.stringReverser;

public class StringReverser {
    public static String[] reverse(String input) {

        String[] modifiedinput = input.split(" ");

        for (int start = 0, end = modifiedinput.length - 1; start < end; start++, end--) {
            String temp = modifiedinput[end];
            modifiedinput[end] = modifiedinput[start];
            modifiedinput[start] = temp;
        }

        return modifiedinput;
    }
}