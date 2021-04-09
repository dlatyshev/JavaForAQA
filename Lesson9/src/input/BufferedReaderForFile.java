package input;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderForFile {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("Lesson9/src/input/example.txt"));
        StringBuilder result = new StringBuilder();
        String line;
        while ((line = reader.readLine()) != null) {
            result.append(line).append("\n");
        }

        System.out.println(result.toString());
    }
}
