import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        long N = Long.parseLong(st.nextToken());
        long R = Long.parseLong(st.nextToken());

        // 비둘기집 원리에 의한 공식: N + 2*R - 1
        long result = N + (2 * R) - 1;

        System.out.println(result);
    }
}