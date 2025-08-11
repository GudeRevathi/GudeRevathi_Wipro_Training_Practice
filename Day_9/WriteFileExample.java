import java.io.FileWriter;
import java.io.IOException;

public class WriteFileExample {
    public static void main(String[] args) {
        try (FileWriter writer = new FileWriter("myfile.txt")) {
            writer.write("Hello, Java File Handling!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
