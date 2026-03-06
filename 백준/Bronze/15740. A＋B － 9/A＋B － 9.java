import java.util.Scanner;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {
    	Scanner scanner=new Scanner(System.in);
    	BigInteger A,B;
    	
    	A=scanner.nextBigInteger();
    	B=scanner.nextBigInteger();
    	
    	System.out.println(A.add(B));
    }
}