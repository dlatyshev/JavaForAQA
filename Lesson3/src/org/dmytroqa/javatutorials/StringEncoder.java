package org.dmytroqa.javatutorials;

import java.util.Random;

public class StringEncoder {

    public static void main(String[] args) {
        String textToEncode;
        int shift;

        if (args.length != 0) {
            textToEncode = args[0];
            shift = Integer.parseInt(args[1]);
        } else {
            textToEncode = "This is a very secret message. We should encode it";
            shift = 25;
        }

        String encodedString = encode(textToEncode, shift);

        System.out.println("Initial String: " + textToEncode);
        System.out.println("Encoded String: " + encodedString);
        System.out.println("Decoded String: " + decode(encodedString, shift));
    }

    public static String encode(String s, int shift) {
        StringBuilder result = new StringBuilder();

        for (char c : s.toCharArray()) {
            result.append((char)(c + shift));
        }

        return result.toString();
    }

    public static String decode(String encodedString, int shift) {
        StringBuilder result = new StringBuilder();

        for (char c : encodedString.toCharArray()) {
            result.append((char)(c - shift));
        }

        return result.toString();
    }
}
