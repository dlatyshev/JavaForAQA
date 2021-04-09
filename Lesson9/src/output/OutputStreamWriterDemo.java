package output;

import java.io.IOException;
import java.io.OutputStreamWriter;

public class OutputStreamWriterDemo {

    public static void main(String[] args) throws IOException {
        OutputStreamWriterDemo demo = new OutputStreamWriterDemo();
        demo.write();
    }

    public void write() throws IOException {
        OutputStreamWriter writer = new OutputStreamWriter(System.out);
        writer.write(65);
        writer.write(10);
        writer.write("Hello");
        writer.close();
    }
}
