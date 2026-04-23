import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());
        
        int[] L = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            L[i] = Integer.parseInt(st.nextToken());
        }

        boolean isSumi = false;

        // 3. K값을 1부터 N/2까지 시도
        for (int K = 1; K <= N / 2; K++) {
            boolean match = true;
            
            // 길이 K만큼 접두사와 접미사를 비교
            for (int j = 0; j < K; j++) {
                // 접두사 인덱스: j
                // 접미사 인덱스: N - K + j
                if (L[j] != L[N - K + j]) {
                    match = false;
                    break;
                }
            }

            if (match) {
                isSumi = true;
                break;
            }
        }

        System.out.println(isSumi ? "yes" : "no");
    }
}