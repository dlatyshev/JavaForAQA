import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Tesst {

    public static void main(String[] args) {
        Path original = Paths.get("Lesson10/src/original.txt");
        Path copyOfOriginal = Paths.get("Lesson10/src/copy_of_original.txt");

        try {
            String read = Files.readString(original);
            Files.writeString(copyOfOriginal, read);
            Files.delete(original);
        } catch (IOException e) {
            System.out.println(e.getMessage());
            System.out.println("Path " + original + " not exists");
        }
    }
}
