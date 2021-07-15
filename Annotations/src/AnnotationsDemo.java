public class AnnotationsDemo {

    public static void main(String[] args) {
        Printer printer = new Printer();
        Stream annotation = printer.getClass().getAnnotation(Stream.class);
        System.out.println(annotation.a() + " " + annotation.b());

        CustomPrinter customPrinter = new CustomPrinter();
        annotation = customPrinter.getClass().getAnnotation(Stream.class);
        System.out.println(annotation.a() + " " + annotation.b());
    }
}
