import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        for (int i = 0; i < input.length(); i++) {
            if (i > 0 && i % 10 == 0) {
                System.out.println();
            }
            System.out.print(input.substring(i, i + 1));
        }
    }
}
