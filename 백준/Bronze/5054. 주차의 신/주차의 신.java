import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            int M = Integer.parseInt(br.readLine());
            String[] str = br.readLine().split(" ");

            int max = Integer.MIN_VALUE;
            int min = Integer.MAX_VALUE;

            for (int j = 0; j < M; j++) {
                int num = Integer.parseInt(str[j]);
                if (num > max) max = num;
                if (num < min) min = num;
            }

            System.out.println((max - min) * 2);
        }
    }
}