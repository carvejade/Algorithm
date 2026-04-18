import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int t = 1; t <= T; t++) {
            int N = Integer.parseInt(br.readLine());
            long[] arr = new long[2 * N]; 
            Map<Long, Integer> counts = new HashMap<>();
            
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int i = 0; i < 2 * N; i++) {
                arr[i] = Long.parseLong(st.nextToken());
                counts.put(arr[i], counts.getOrDefault(arr[i], 0) + 1);
            }

            StringBuilder sb = new StringBuilder();
            sb.append("Case #").append(t).append(":");

            for (int i = 0; i < 2 * N; i++) {
                long discount = arr[i];
                
                if (counts.get(discount) == 0) continue;

                long origin = (discount / 3) * 4;

                counts.put(discount, counts.get(discount) - 1);
                counts.put(origin, counts.get(origin) - 1);

                sb.append(" ").append(discount);
            }
            System.out.println(sb.toString());
        }
    }
}