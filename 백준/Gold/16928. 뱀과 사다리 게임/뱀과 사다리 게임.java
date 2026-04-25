import java.io.*;
import java.util.*;

public class Main {
    static int[] board = new int[101];
    static boolean[] visited = new boolean[101];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken()); 
        int M = Integer.parseInt(st.nextToken()); 

        for (int i = 0; i < N + M; i++) {
            st = new StringTokenizer(br.readLine());
            int from = Integer.parseInt(st.nextToken());
            int to = Integer.parseInt(st.nextToken());
            board[from] = to;
        }

        System.out.println(bfs(1));
    }

    static int bfs(int start) {
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{start, 0}); 
        visited[start] = true;

        while (!q.isEmpty()) {
            int[] current = q.poll();
            int pos = current[0];
            int dist = current[1];

            if (pos == 100) return dist;

            for (int i = 1; i <= 6; i++) {
                int next = pos + i;

                if (next > 100) continue;

                if (board[next] != 0) {
                    next = board[next];
                }

                if (!visited[next]) {
                    visited[next] = true;
                    q.add(new int[]{next, dist + 1});
                }
            }
        }
        return -1; 
    }
}