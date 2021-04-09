package output;

import java.io.BufferedOutputStream;
import java.io.IOException;

public class OutputStreamDemo {

    public static void main(String[] args) throws IOException {
        OutputStreamDemo demo = new OutputStreamDemo();
        demo.writeByte();
    }

    public void writeByte() throws IOException {
        try(BufferedOutputStream stream = new BufferedOutputStream(System.out)) {
            stream.write(122);
        } catch (IOException exception) {

        }
    }
}
