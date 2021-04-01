public class JustPrinter implements Printable {

    @Override
    public void print(String s) {
        System.out.println("Just print " + s);
    }
}
