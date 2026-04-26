import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        int time = 0;
        char current = 'A';

        for (int i = 0; i < s.length(); i++) {
            char target = s.charAt(i);

            int diff = Math.abs(target - current);
            time += Math.min(diff, 26 - diff);

            current = target;
        }

        System.out.println(time);
    }
}