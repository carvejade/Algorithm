import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    static int A, T, target;
    static int p = 0; // 현재 말할 사람
    static int cnt = 0;    // target이 나온 횟수

    static boolean say(int word) {
        if (word == target) {
            cnt++;
            if (cnt == T) {
                System.out.println(p);
                return true; // 끝
            }
        }
        p = (p + 1) % A; // 다음 사람
        return false;
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        A = Integer.parseInt(br.readLine());
        T = Integer.parseInt(br.readLine());
        target = Integer.parseInt(br.readLine()); // 0: 뻔, 1: 데기

        for (int r = 1; ; r++) {
            
            if (say(0)) return;
            if (say(1)) return;
            if (say(0)) return;
            if (say(1)) return;

            // 뻔 (r+1)번
            for (int i = 0; i < r + 1; i++) {
                if (say(0)) return;
            }

            // 데기 (r+1)번
            for (int i = 0; i < r + 1; i++) {
                if (say(1)) return;
            }
        }
    }
}
