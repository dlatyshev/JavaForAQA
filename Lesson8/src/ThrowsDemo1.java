public class ThrowsDemo1 {

    public static void myMethod() {
        throw new IllegalArgumentException();
    }

    public static void main(String[] args) {
        myMethod();
    }
}
