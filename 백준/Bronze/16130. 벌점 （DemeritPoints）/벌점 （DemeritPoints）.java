import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String nLine = br.readLine();
        if (nLine == null) return;
        int N = Integer.parseInt(nLine.trim());
        
        StringBuilder sb = new StringBuilder();

        while (N-- > 0) {
            String str = br.readLine();
            if (str == null) break;

            int point = 0;
            int weeks = 0;
            String detail = "";

            for (int i = 0; i < str.length(); i++) {
                char c = str.charAt(i);
                int value;

                if (c >= '0' && c <= '9') {
                    value = c - '0';
                } else {
                    value = c - 'A' + 10;
                }

                int prevQuotient = point / 10;
                point += value;
                int quotient = point / 10;

                if (quotient == 4) {
                    detail = "(weapon)";
                    break;
                } else if (quotient > 4) {
                    detail = "(09)";
                    break;
                } else {
                    // 이전 몫과 현재 몫이 다르면 (10점 단위를 넘었다면)
                    if (prevQuotient != quotient) {
                        weeks += quotient;
                    }
                }
            }
            // 결과를 StringBuilder에 쌓아서 한 번에 출력
            sb.append(weeks).append(detail).append("\n");
        }
        System.out.print(sb.toString());
    }
}