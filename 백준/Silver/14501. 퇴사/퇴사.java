import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine().trim());

        int[] T = new int[N + 1];
        int[] P = new int[N + 1];

        for (int i = 1; i <= N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            T[i] = Integer.parseInt(st.nextToken());
            P[i] = Integer.parseInt(st.nextToken());
        }

        int[] dp = new int[N + 2]; // dp[N+1] = 0 포함 (퇴사날)

        for (int i = N; i >= 1; i--) {
            int next = i + T[i];
            // 상담 안 하는 경우
            dp[i] = dp[i + 1];

            // 상담 하는 경우(가능할 때만)
            if (next <= N + 1) {
                dp[i] = Math.max(dp[i], P[i] + dp[next]);
            }
        }

        System.out.println(dp[1]);
    }
}