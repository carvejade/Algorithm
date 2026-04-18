import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long L = Long.parseLong(br.readLine());

        double result = Math.sqrt(3) / 4 * L * L;

        System.out.println(result);
    }
}