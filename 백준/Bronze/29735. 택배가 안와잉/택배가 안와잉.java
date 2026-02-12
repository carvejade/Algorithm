import java.io.*;
import java.util.*;

public class Main {
    static int toMin(String hhmm) {
        String[] p = hhmm.split(":");
        return Integer.parseInt(p[0]) * 60 + Integer.parseInt(p[1]);
    }

    static String toHHMM(int mins) {
        int h = mins / 60;
        int m = mins % 60;
        return String.format("%02d:%02d", h, m);
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int start = toMin(st.nextToken());
        int end = toMin(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int T = Integer.parseInt(st.nextToken());

        int work = end - start; 

        int cap = (work - 1) / T; 

        int total = N + 1; 
        int day = (total - 1) / cap; 
        int pos = (total - 1) % cap + 1; 
        int arrival = start + pos * T; 

        System.out.println(day);
        System.out.println(toHHMM(arrival));
    }
}
