import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();

      long start = (a % 2 == 0) ? a : a + 1;
      if (start < 4) start = 4;

      long end = (b % 2 == 0) ? b : b - 1;
      
      if (start > end) {
          System.out.println(0);
          return;
      }
      
      long count = (end - start) / 2 + 1;
      long sum = count * (start + end) / 2;
      
      System.out.println(sum);
    }
}