package input;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo {

    public static void main(String[] args) throws IOException {
        FileReader reader = new FileReader("Lesson9/src/input/example.txt");
        char[] buff = new char[100];
        int readCharacters = reader.read(buff);
        StringBuilder result = new StringBuilder();

        for (char c : buff) {
            result.append(c);
        }

        System.out.println(result.toString());
        System.out.println(readCharacters);
    }
}
