import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @author r.harkins
 */
public class Pyramid {
    private int size;

    public Pyramid() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = 0;
        do {
            try {
                System.out.println("How tall do you want your pyramind?");
                size = Integer.parseInt(br.readLine());
            } catch (Exception e) {
                System.out.println("Not a valid number");
            }
        } while (!isValid(size));

    }

    public Pyramid(int size) {
        this.size = size;
    }

    private static boolean isValid(int n) {
        if (n < 1 || n > 23) {
            System.out.println("Not a valid number");
            return false;
        } else {
            return true;
        }
    }

    public String toString() {
        StringBuilder builder = new StringBuilder();
        for (int i = 1; i <= size; i++) {
            int count = 0;
            while (count++ < i) {
                builder.append("#");
            }
            builder.append("\n");
        }
        return builder.toString();
    }

}
