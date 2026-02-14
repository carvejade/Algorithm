import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	    public static void main(String[] args) throws Exception {
	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        StringTokenizer st = new StringTokenizer(br.readLine());

	        int N = Integer.parseInt(st.nextToken());
	        int M = Integer.parseInt(st.nextToken());

	        long[] a = new long[N + 1]; 

	        st = new StringTokenizer(br.readLine());
	        for (int i = 1; i <= N; i++) {
	            a[i] = a[i - 1] + Integer.parseInt(st.nextToken());
	        }

	        StringBuilder sb = new StringBuilder();

	        for (int i = 0; i < M; i++) {
	            st = new StringTokenizer(br.readLine());
	            int l = Integer.parseInt(st.nextToken());
	            int r = Integer.parseInt(st.nextToken());

	            long result = a[r] - a[l - 1];
	            sb.append(result).append("\n");
	        }

	        System.out.print(sb);
	    }
}
