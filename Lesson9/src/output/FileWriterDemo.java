package output;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {

    public static void main(String[] args) throws IOException {
        FileWriter writer = new FileWriter("Lesson9/src/output/example2.txt");
        writer.write(64);
        writer.write("Hello");
        writer.close();
    }
}
