import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int testCase = Integer.parseInt(br.readLine());

        for (int i = 0; i < testCase; i++) {
            int num = Integer.parseInt(br.readLine());

            long bestGram = 0;
            long bestPrice = 0;

            for (int j = 0; j < num; j++) {
                StringTokenizer st = new StringTokenizer(br.readLine());

                long gram = Long.parseLong(st.nextToken());
                long price = Long.parseLong(st.nextToken());

                if (j == 0) {
                    bestGram = gram;
                    bestPrice = price;
                } else {
                    long left = gram * bestPrice;
                    long right = bestGram * price;

                    if (left > right) { 
                        bestGram = gram;
                        bestPrice = price;
                    } else if (left == right && price < bestPrice) {
                        bestGram = gram;
                        bestPrice = price;
                    }
                }
            }

            sb.append(bestPrice).append("\n");
        }

        System.out.println(sb);
    }
}