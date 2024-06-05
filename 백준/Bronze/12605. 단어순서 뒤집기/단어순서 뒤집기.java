import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int cases = Integer.parseInt(br.readLine());

        for(int i = 1; i <= cases; i++) {
            String[] words = br.readLine().split(" ");
            String sentences = "";

            for(int j = words.length - 1; j >= 0; j--) {
                sentences += words[j];
                if(j != 0) {
                    sentences += " ";
                }
            }
            System.out.println("Case #" + i + ": " + sentences);
        }


    }
}
