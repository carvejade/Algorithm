import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine().trim());

        long[][] arr = new long[N][2]; 
        // [][0] = 번호
        // [][1] = W^2 + H^2

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            long W = Long.parseLong(st.nextToken());
            long H = Long.parseLong(st.nextToken());

            arr[i][0] = i + 1;           // 번호
            arr[i][1] = W*W + H*H;       // 점수
        }

        Arrays.sort(arr, (a, b) -> {
            if (a[1] != b[1]) return Long.compare(b[1], a[1]); // PPI 내림차순
            return Long.compare(a[0], b[0]); // 번호 오름차순
        });

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            sb.append(arr[i][0]).append('\n');
        }

        System.out.print(sb);
    }
}