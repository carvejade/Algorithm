import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {

    static BigInteger multiplyRange(int left, int right) {
        if (left > right) return BigInteger.ONE;
        if (left == right) return BigInteger.valueOf(left);
        if (right - left == 1) {
            return BigInteger.valueOf((long) left).multiply(BigInteger.valueOf((long) right));
        }

        int mid = (left + right) / 2;
        return multiplyRange(left, mid).multiply(multiplyRange(mid + 1, right));
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        if (n == 0 || n == 1) {
            System.out.println(1);
            return;
        }

        System.out.println(multiplyRange(1, n));
    }
}