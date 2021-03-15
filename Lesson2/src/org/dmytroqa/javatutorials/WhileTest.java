package org.dmytroqa.javatutorials;


// This generates random numbers until particular condition is met
public class WhileTest {

    static boolean condition() {
        boolean result = Math.random() < 0.99;
        System.out.print(result + ", ");
        return result;
    }

    public static void main(String... args) {
        while(condition()) {
            System.out.println("Inside while loop");
        }
        System.out.println("Outside while loop");
    }
}

// java WhileTest.java | wc -l

