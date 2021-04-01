package lesson;

public class DynamicStack implements IntStack {

    private int[] stack;
    private int pos;
    public int length;

    DynamicStack(int size) {
        stack = new int[size];
        this.length = size;
        pos = -1;
    }

    public void push(int value) {
        if (pos == stack.length - 1) {
            int[] tempStack = new int[length * 2];
            length = tempStack.length;
            for (int i = 0; i < stack.length; i++) {
                tempStack[i] = stack[i];
            }
            stack = tempStack;
            stack[++pos] = value;
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
