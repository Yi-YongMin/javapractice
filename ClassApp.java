import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class ClassApp {
    public static void main(String[] args) throws FileNotFoundException {
        PrintWriter p1 = new PrintWriter("result1.txt");
        p1.write("Hello 1");
        p1.close();

        PrintWriter p2 = new PrintWriter("result2.txt");
        p1.write("Hello 2");
        p1.close();
    }
}