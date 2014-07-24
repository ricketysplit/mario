import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class MarioFile implements Printer {

    @Override
    public void print(Pyramid p) {
        try {
            PrintWriter pWriter = new PrintWriter("mario.txt", "UTF-8");
            pWriter.append(p.toString());
            pWriter.close();
        } catch (FileNotFoundException ex) {
        } catch (UnsupportedEncodingException ex) {
        }
    }

}
