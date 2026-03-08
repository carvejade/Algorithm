import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());

        for (int tc = 0; tc < T; tc++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            long d = Long.parseLong(st.nextToken());
            long n = Long.parseLong(st.nextToken());
            long s = Long.parseLong(st.nextToken());
            long p = Long.parseLong(st.nextToken());

            long ser = n * s;
            long par = d + n * p;

            if (par < ser) {
                sb.append("parallelize\n");
            } else if (par > ser) {
                sb.append("do not parallelize\n");
            } else {
                sb.append("does not matter\n");
            }
        }

        System.out.print(sb);
    }
}