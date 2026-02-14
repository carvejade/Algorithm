import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        long M = Long.parseLong(st.nextToken());

        int[] h = new int[N];
        st = new StringTokenizer(br.readLine());

        int maxH = 0;
        for (int i = 0; i < N; i++) {
            h[i] = Integer.parseInt(st.nextToken());
            if (h[i] > maxH) maxH = h[i];
        }

        int lo = 0, hi = maxH;
        int ans = 0;

        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;

            long wood = 0;
            for (int x : h) {
                if (x > mid) wood += (x - mid);
                if (wood >= M) break; 
            }

            if (wood >= M) {
                ans = mid;
                lo = mid + 1;
            } else {
                hi = mid - 1;
            }
        }

        System.out.println(ans);
    }
}
