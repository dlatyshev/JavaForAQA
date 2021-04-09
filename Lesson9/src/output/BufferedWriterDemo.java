package output;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class BufferedWriterDemo {

    public static void main(String[] args) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter("Lesson9/src/output/example3.txt"));
        writer.write("Hello");
        writer.newLine();
        writer.write("World");
        writer.flush();
        writer.close();

    }
}
