public class CalcTest {

    public static void main(String[] args) {
        Calculator calculator = new Calculator(10, 5, '+');
        System.out.println(calculator.calculate());
        calculator.setOperation('-');
        System.out.println(calculator.calculate());
        calculator.setLeftVal(20);
        calculator.setOperation('*');
        System.out.println(calculator.calculate());
    }
}
