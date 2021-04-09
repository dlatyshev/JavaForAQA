package input;

import java.util.Scanner;

public class ScannerDemo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String line = scanner.nextLine();
        double val = scanner.nextDouble();
        int intval = scanner.nextInt();
        System.out.println(line.toCharArray());
    }
}
