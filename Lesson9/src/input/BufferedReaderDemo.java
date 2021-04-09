package input;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderDemo {

    public static void main(String[] args) throws IOException {
        BufferedReaderDemo demo = new BufferedReaderDemo();
//        demo.readCharacter();
        demo.readWholeLine();
    }

    public void readCharacter() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            int character = reader.read();
            System.out.println("Code: " + character + ", Character: " + (char) character);

        } catch (IOException exception) {

        }
    }

    public void readWholeLine() throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = "";
        System.out.println("Enter lines of text or 'exit' to quit()");
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            while (!str.equals("exit")) {
                str = br.readLine();
                System.out.println(str);
            }
        } catch (IOException exception) {

        }
    }
}
