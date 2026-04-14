import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int[] arr = new int[N];
        
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        int ans = -1;

        for (int X = 0; X <= N; X++) {
            int cnt = 0;

            for (int i = 0; i < N; i++) {
                if (arr[i] == X) {
                    cnt++;
                }
            }

            if (cnt == X) {
                ans = Math.max(ans, X);
            }
        }

        System.out.println(ans);
    }
}