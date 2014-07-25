import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Mario {

    public static void main(String[] args) {
        Mario mario = new Mario(PyramidBuilder.getInstance());
    }

    private PyramidBuilder pBuilder;

    public Mario(PyramidBuilder pBuilder) {
        this.pBuilder = pBuilder;
        start();
    }

    private void start() {
        Printer p = null;
        String ans = "";
        while (!ans.equals("Y") && !ans.equals("N")) {
            System.out.println("Would you like to print your pyramid to a file? (Y/N)");
            try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));){
                ans = br.readLine();
            } catch (IOException ex) {
                Logger.getLogger(Mario.class.getName()).log(Level.SEVERE, null, ex);
            }
            if (ans.equals("Y")) {
                p = new MarioFile();
            } else if (ans.equals("N")) {
                p = new MarioConsole();
            } else {
                System.out.println("Invalid answer");
            }
        }
        p.print(pBuilder.pyramid());
    }


}
