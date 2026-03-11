import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();

        String[] croatia = {"dz=", "c=", "c-", "d-", "lj", "nj", "s=", "z="};

        for (String c : croatia) {
            s = s.replace(c, "*");
        }

        System.out.println(s.length());
    }
}