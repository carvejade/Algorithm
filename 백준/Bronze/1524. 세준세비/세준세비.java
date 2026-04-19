import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // T 읽기
        String line = br.readLine();
        if (line == null || line.isEmpty()) return;
        int t = Integer.parseInt(line);

        for (int i = 0; i < t; i++) {
            // 빈 줄 건너뛰기 로직
            String input = br.readLine();
            while (input != null && input.isEmpty()) {
                input = br.readLine();
            }
            
            // N과 M 읽기
            StringTokenizer st = new StringTokenizer(input);
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());

            int maxSejun = 0;
            int maxSebi = 0;

            // 세준의 병사들 최댓값 
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                int sejun = Integer.parseInt(st.nextToken());
                if (sejun > maxSejun) maxSejun = sejun;
            }

            // 세비의 병사들  최댓값 
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                int sebi = Integer.parseInt(st.nextToken());
                if (sebi > maxSebi) maxSebi = sebi;
            }

            // 제일 강한 병사 비교
            if (maxSejun >= maxSebi) {
                System.out.println("S");
            } else {
                System.out.println("B");
            }
        }
    }
}