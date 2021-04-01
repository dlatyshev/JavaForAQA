package lesson;

public class Main {

    public void fillStack(IntStack stack, int... numbers) {
        for (int number : numbers) {
            stack.push(number);
        }
    }

    public void printStack(IntStack stack) {
        int value = stack.pop();
        while (value != -1) {
            System.out.println(value);
            value = stack.pop();
        }
    }

    public static void main(String[] args) {
        FixedStack fixed = new FixedStack(10);
        DynamicStack dynamicStack = new DynamicStack(10);

        Main main = new Main();
        main.fillStack(fixed, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        main.printStack(fixed);
        System.out.println();
        main.fillStack(dynamicStack, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20);
        main.printStack(dynamicStack);
    }
}
