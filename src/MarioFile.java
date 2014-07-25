import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class MarioFile implements Printer {

    @Override
    public void print(Pyramid p) {
        try (PrintWriter printWriter = new PrintWriter("mario.txt", "UTF-8");){
            printWriter.append(p.toString());
        } catch (FileNotFoundException ex) {
        } catch (UnsupportedEncodingException ex) {
        }
    }

}
