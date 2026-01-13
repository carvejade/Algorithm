
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		long K = Long.parseLong(st.nextToken());
		
        st = new StringTokenizer(br.readLine());

        HashMap<Long, Long> m = new HashMap<>();
        m.put(0L, 1L);

        long sum = 0L;
        long ans = 0L;

        for (int i = 0; i < N; i++) {
            long x = Long.parseLong(st.nextToken());
            sum += x;

            ans += m.getOrDefault(sum - K, 0L);
            m.put(sum, m.getOrDefault(sum, 0L) + 1L);
        }

        System.out.println(ans);
    }
}