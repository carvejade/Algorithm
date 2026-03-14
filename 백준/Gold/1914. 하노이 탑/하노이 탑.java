import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {

    static StringBuilder sb = new StringBuilder();

    static void hanoi(int n, int from, int via, int to) {
        if (n == 1) {
            sb.append(from).append(" ").append(to).append("\n");
            return;
        }

        hanoi(n - 1, from, to, via);
        sb.append(from).append(" ").append(to).append("\n");
        hanoi(n - 1, via, from, to);
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        BigInteger count = BigInteger.TWO.pow(N).subtract(BigInteger.ONE);
        sb.append(count).append("\n");

        if (N <= 20) {
            hanoi(N, 1, 2, 3);
        }

        System.out.print(sb);
    }
}