public class Main {


    public static void print(Printable printable, String s) {
        printable.print(s);
    }

    public static void main(String[] args) {
        AdvancedPrinter advancedPrinter = new AdvancedPrinter();
        JustPrinter justPrinter = new JustPrinter();

        print(advancedPrinter, "Hello");
        print(justPrinter, "World");
    }
}
