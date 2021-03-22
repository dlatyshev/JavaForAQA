public class StaticCalculator {

    public static double add(double leftOperand, double rightOperand) {
        return leftOperand + rightOperand;
    }

    public static double subtract(double leftOperand, double rightOperand) {
        return leftOperand - rightOperand;
    }

    public static double multiply(double leftOperand, double rightOperand) {
        return leftOperand * rightOperand;
    }

    public static double divide(double leftOperand, double rightOperand) {
        if (rightOperand == 0) {
            return 0;
        }

        return leftOperand / rightOperand;
    }
}
