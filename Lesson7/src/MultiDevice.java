import java.util.Scanner;

public class MultiDevice {

    private MyScanner scanner;
    private Printer printer;

    public MultiDevice(MyScanner scanner, Printer printer) {
        this.scanner = scanner;
        this.printer = printer;
    }


    public void scanAndPrint() {
        String scannedText = scanner.scanText();
        printer.print(scannedText);
    }

    public void justPrint(String s) {
        printer.print(s);
    }

    public static void main(String[] args) {
        Printer printer = new Printer();
        MyScanner scanner = new AdvancedScanner();

        MultiDevice device = new MultiDevice(scanner, printer);
        device.scanAndPrint();
    }
}
