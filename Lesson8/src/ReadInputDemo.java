import java.util.InputMismatchException;
import java.util.Scanner;

public class ReadInputDemo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] ints = new int[100];
        int index = 0;

        try {
            while (true) {
                int val = scanner.nextInt();
                ints[index] = val;
                index++;
            }
        } catch (InputMismatchException e) {

        }

        for (int i = 0; i < index; i++) {
            System.out.println(ints[i]);
        }
    }
}
