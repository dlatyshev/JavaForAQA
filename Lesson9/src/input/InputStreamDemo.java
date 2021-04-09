package input;

import java.io.*;

public class InputStreamDemo {

    public static void main(String[] args) throws IOException {
        InputStreamDemo demo = new InputStreamDemo();
//        demo.readOneByte();
        demo.readPerByte();
    }

    public void readOneByte() throws IOException {
        BufferedInputStream stream = new BufferedInputStream(System.in);
        try {
            int readByte = stream.read(); // Create input stream via the console. Read only one byte.
            char readChar = (char)readByte;
            System.out.println(readByte);
            System.out.println(readChar);

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            stream.close();
        }
    }

    public void readPerByte() throws IOException {
        BufferedInputStream stream = new BufferedInputStream(System.in);
        try {
            int readByte = stream.read();
            while (stream.available() > 0) {
                System.out.println("Read byte: " + readByte + ", Character: " + (char) readByte);
                readByte = stream.read();
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            stream.close();
        }
    }
}
