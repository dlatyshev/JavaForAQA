package input;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamDemo {

    public static void main(String[] args) throws IOException {
        FileInputStream stream = new FileInputStream("Lesson9/src/input/example.txt");
        int readByte;
        StringBuilder result = new StringBuilder();

        while (stream.available() > 0) {
            readByte = stream.read();
//            result.append(readByte);
            result.append((char)readByte);
        }

        System.out.println(result);
    }
}
