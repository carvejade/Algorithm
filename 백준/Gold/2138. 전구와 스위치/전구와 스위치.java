import java.io.*;
import java.util.*;

public class Main {

    static int n;
    static int[] now, goal;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());
        now = new int[n];
        goal = new int[n];

        String a = br.readLine();
        String b = br.readLine();

        for (int i = 0; i < n; i++) {
            now[i] = a.charAt(i) - '0';
            goal[i] = b.charAt(i) - '0';
        }

        int case1 = run(now.clone(), false);
        int case2 = run(now.clone(), true);

        int ans = Integer.MAX_VALUE;

        if (case1 != -1) ans = Math.min(ans, case1);
        if (case2 != -1) ans = Math.min(ans, case2);

        System.out.println(ans == Integer.MAX_VALUE ? -1 : ans);
    }

    static int run(int[] bulb, boolean firstPress) {
        int cnt = 0;

        if (firstPress) {
            click(bulb, 0);
            cnt++;
        }

        for (int i = 1; i < n; i++) {
            if (bulb[i - 1] != goal[i - 1]) {
                click(bulb, i);
                cnt++;
            }
        }

        if (Arrays.equals(bulb, goal)) {
            return cnt;
        }
        return -1;
    }

    static void click(int[] bulb, int idx) {
        for (int i = idx - 1; i <= idx + 1; i++) {
            if (i >= 0 && i < n) {
                bulb[i] ^= 1; //XOR
            }
        }
    }
}