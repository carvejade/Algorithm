
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[][] talk = new int[10][2];

        for (int i = 1; i <= 9; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            talk[i][0] = Integer.parseInt(st.nextToken());
            talk[i][1] = Integer.parseInt(st.nextToken());
        }

        List<Set<Integer>> validSets = new ArrayList<>();

        // 1. 거짓말쟁이 가정
        for (int liar = 1; liar <= 9; liar++) {

            Set<Integer> possibleFirst = new HashSet<>();

            // 2. 1루수 후보 가정
            for (int first = 1; first <= 9; first++) {

                boolean ok = true;

                for (int j = 1; j <= 9; j++) {
                    int type = talk[j][0];
                    int target = talk[j][1];

                    // 거짓말쟁이면 반대로
                    if (j == liar) type = 1 - type;

                    // 검증
                    if (type == 1 && target != first) {
                        ok = false;
                        break;
                    }
                    if (type == 0 && target == first) {
                        ok = false;
                        break;
                    }
                }

                if (ok) possibleFirst.add(first);
            }

            // 이 거짓말 가정이 유효한 경우만
            if (!possibleFirst.isEmpty()) {
                validSets.add(possibleFirst);
            }
        }

        // 3. 교집합 구하기
        if (validSets.isEmpty()) {
            System.out.println(-1);
            return;
        }

        Set<Integer> answer = new HashSet<>(validSets.get(0));

        for (Set<Integer> s : validSets) {
            answer.retainAll(s);
        }

        // 4. 결과 출력
        if (answer.size() == 1) {
            for (int x : answer) {
                System.out.println(x);
            }
        } else {
            System.out.println(-1);
        }
    }
}