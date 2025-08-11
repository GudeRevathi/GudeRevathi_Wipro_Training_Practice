import java.io.FileInputStream;
import java.io.ObjectInputStream;
public class DeserializeExampl {
    public static void main(String[] args) {
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("student.ser"))) {
            Student1 s = (Student1) in.readObject();
            s.display();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
