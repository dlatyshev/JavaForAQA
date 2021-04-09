package input;

import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class InputStreamReaderDemo {

    public static void main(String[] args) throws IOException {
        InputStreamReaderDemo demo = new InputStreamReaderDemo();
//        demo.readCharacter();
//        demo.readCharacters();
        demo.readPerCharacter();
    }

    public void readCharacter() {
        InputStreamReader reader = new InputStreamReader(System.in);
        try {
            int readChar = reader.read();
            System.out.println("Code: " + readChar + ", Character: " + (char) readChar);

        } catch (IOException ex) {

        }
    }

    public void readCharacters() throws IOException {
        InputStreamReader reader = new InputStreamReader(System.in);
        try {
            char[] buffer = new char[10];
            reader.read(buffer);
            System.out.println(Arrays.toString(buffer));
        } catch (IOException ex) {

        } finally {
            reader.close();
        }
    }

    public void readPerCharacter() throws IOException {
        InputStreamReader reader = new InputStreamReader(System.in);
        try {
            int character = reader.read();
            while (reader.ready()) {
                System.out.println("Code: " + character + ", Character: " + (char) character);
                character = reader.read();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            reader.close();
        }

    }
}
