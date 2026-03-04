import java.util.Scanner;
 
public class Main {
    public static void main(String args[]) {
        
        Scanner sc = new Scanner(System.in);
        
        int testCase = sc.nextInt();
        
        for (int t = 0; t < testCase; t++) {
            int shuttle = sc.nextInt();
            int distance = sc.nextInt();
            
            int cnt = 0;
            
            for (int i = 0; i < shuttle; i++) {
                double v = sc.nextDouble();
                double f = sc.nextDouble();
                double c = sc.nextDouble();
                
                double dTG = v * (f / c);
                if (dTG - distance >= 0) {
                    cnt += 1;
                }
            }
            System.out.println(cnt);
        }
        
    }
}