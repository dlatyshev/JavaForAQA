package output;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo {

    public static void main(String[] args) throws IOException {
        FileOutputStream stream = new FileOutputStream("Lesson9/src/output/example.txt");
        stream.write(64);
        stream.write(new byte[]{65, 66, 67, 68, 69, 70});
        stream.close();
    }
}
