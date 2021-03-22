public class Calculator {

    private double leftVal;
    private double rightVal;
    private char operation;

    public Calculator(double leftVal, double rightVal, char operation) {
        this.leftVal = leftVal;
        this.rightVal = rightVal;
        this.operation = operation;
    }

    public double calculate() {
        return switch (operation) {
            case '+' -> leftVal + rightVal;
            case '-' -> leftVal - rightVal;
            case '*' -> leftVal * rightVal;
            case '/' -> rightVal != 0 ? leftVal / rightVal : 0;
            default -> 0.0;
        };

    }

    public double getLeftVal() {
        return leftVal;
    }

    public void setLeftVal(double leftVal) {
        this.leftVal = leftVal;
    }

    public double getRightVal() {
        return rightVal;
    }

    public void setRightVal(double rightVal) {
        this.rightVal = rightVal;
    }

    public char getOperation() {
        return operation;
    }

    public void setOperation(char operation) {
        this.operation = operation;
    }
}
