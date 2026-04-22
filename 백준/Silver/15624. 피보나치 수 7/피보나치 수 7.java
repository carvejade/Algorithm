import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int [] fibo = new int[1000001];
        fibo[0] = 0;
        fibo[1] = 1;

        for(int i=2; i<=n; i++){
            fibo[i] = (fibo[i-2] + fibo[i-1])%(1000000007);
        }

        System.out.println(fibo[n]);
    }
}