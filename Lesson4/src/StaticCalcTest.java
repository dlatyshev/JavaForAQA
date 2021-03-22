public class StaticCalcTest {

    public static void main(String[] args) {
        System.out.println(StaticCalculator.add(5, 4));
        System.out.println(StaticCalculator.subtract(5, 4));
        System.out.println(StaticCalculator.multiply(5, 4));
        System.out.println(StaticCalculator.divide(5, 0));
        System.out.println(StaticCalculator.divide(5, 2));
    }
}
