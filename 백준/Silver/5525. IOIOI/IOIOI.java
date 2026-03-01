import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());
        String S = br.readLine();

        int ans = 0;
        int cnt = 0;

        for (int i = 1; i < M - 1; i++) {
            if (S.charAt(i - 1) == 'I' &&
                S.charAt(i) == 'O' &&
                S.charAt(i + 1) == 'I') {

                cnt++;
                if (cnt >= N) ans++;

                i++; // 겹치는 IOI 처리
            } else {
                cnt = 0;
            }
        }

        System.out.println(ans);
    }
}