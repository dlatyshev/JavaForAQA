package org.dmytroqa.javatutorials;

import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        StringBuilder builder = new StringBuilder();

        String s = "";
        for (char c : "Hello world".toCharArray()) {
            builder.append(c);
        }

        System.out.println(builder.toString());
    }
}
