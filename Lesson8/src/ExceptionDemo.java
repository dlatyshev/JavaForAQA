public class ExceptionDemo {

    public static void main(String... args) {
        int a = 0;
        try {
            //int b = 10 / a; // division by 0
//            String s = null;
//            System.out.println(s.toUpperCase());
            int[] c = new int[5];
            System.out.println(c[5]);

        } catch (ArithmeticException e) {
            System.out.println("Division by 0");
        } catch (NullPointerException e) {
            System.out.println("Null pointer ex");
        }


        System.out.println("Final LINE");
    }
}
