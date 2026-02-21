import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        long N = Long.parseLong(st.nextToken());
        long M = Long.parseLong(st.nextToken());

        st = new StringTokenizer(br.readLine());
        long T = Long.parseLong(st.nextToken());
        long S = Long.parseLong(st.nextToken());

        long sleepZip = (N - 1) / 8; // 집에서 필요한 수면 횟수
        long sleepDok = (M - 1) / 8; // 독서실에서 필요한 수면 횟수

        long timeZip = N + sleepZip * S;
        long timeDok = T + M + sleepDok * (2L * T + S);

        if (timeZip < timeDok) {
            System.out.println("Zip");
            System.out.println(timeZip);
        } else {
            System.out.println("Dok");
            System.out.println(timeDok);
        }
    }
}