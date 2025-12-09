
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    static StringBuilder ans = new StringBuilder();
    static boolean[] used = new boolean[26];

    public static void main(String[] args) throws IOException {
        int N = Integer.parseInt(br.readLine());
        for (int n = 0; n < N; n++) {
            String input = br.readLine();
            ans.append(func(input)).append("\n");
        }
        System.out.println(ans);
    }

    private static Object func(String input) {
        String[] word = input.split(" ");
        int index = -1;

        // 1) 단어 첫글자 우선
        int pos = 0;
        for (String w : word) {
            if (w.length() == 0) {
                pos += 1;
                continue;
            }

            char c = w.charAt(0);

            int idx = Character.toLowerCase(c) - 'a';
            if (!used[idx]) {
                used[idx] = true;
                index = input.indexOf(w, pos);
                return input.substring(0, index) + "[" + c + "]" + input.substring(index + 1);
            }
            pos += w.length() + 1;
        }

        // 2) 왼쪽부터 전체 검색
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (c == ' ') continue;
      

            int idx = Character.toLowerCase(c) - 'a';
            if (!used[idx]) {
                used[idx] = true;
                return input.substring(0, i) + "[" + c + "]" + input.substring(i + 1);
            }
        }

        // 3) 단축키 배정 불가
        return input;
    }

}
