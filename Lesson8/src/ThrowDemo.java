public class ThrowDemo {


    static void iThrowException(String argument) throws TheLetterIsNull{
        try {
            if (argument == null || argument.isEmpty())
                throw new NullPointerException("Null");
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
            throw new TheLetterIsNull("Bla bla bla");
        }
    }

    public static void main(String... args) {
        try {
            iThrowException("");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
