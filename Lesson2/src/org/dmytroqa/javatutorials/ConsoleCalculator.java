package org.dmytroqa.javatutorials;

public class ConsoleCalculator {

    public static void main(String[] args) {
        if (args.length < 3) {
            System.out.println("You must provide 3 arguments (leftOperand operation rightOperand)");
            return;
        }

        double leftOperand = Double.parseDouble(args[0]);
        String operation = args[1];
        double rightOperand = Double.parseDouble(args[2]);

        switch (operation) {
            case "+" -> System.out.println(leftOperand + " + " + rightOperand + " = " + (leftOperand + rightOperand));
            case "-" -> System.out.println(leftOperand + " - " + rightOperand + " = " + (leftOperand - rightOperand));
            case "x" -> System.out.println(leftOperand + " x " + rightOperand + " = " + (leftOperand * rightOperand));
            case "/" -> System.out.println(leftOperand + " / " + rightOperand + " = " + (leftOperand / rightOperand));
            default -> System.out.println("No such operation.");
        }
    }
}
