package lesson;

public class FixedStack implements IntStack {

    private int[] stack;
    private int pos;
    public final int length;

    FixedStack(int size) {
        stack = new int[size];
        pos = -1;
        this.length = size;
    }

    public void push(int value) {
        if (pos == stack.length - 1) {
            System.out.println("Stack is full");
        } else {
            stack[++pos] = value;
        }
    }

    public int pop() {
        if (pos < 0) {
            System.out.println("Stack is empty");
            return -1;
        } else {
            return stack[pos--];
        }
    }
}
