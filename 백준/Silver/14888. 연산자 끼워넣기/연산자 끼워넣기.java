import java.util.Scanner;

public class Main {
	static int N, sum;
	static int Min = Integer.MAX_VALUE;
	static int Max = Integer.MIN_VALUE;
	static int [] arr;
	static int [] op = new int [4];
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N =sc.nextInt();
		arr = new int [N];
		for(int i =0; i<N; i++) {
			arr[i]= sc.nextInt();
		} // 수 입력
		for(int i =0; i<4; i++) {
			op[i] = sc.nextInt();
		} //연산자 개수 입력
		sum = arr[0];
		comb(sum,1);
		System.out.println(Max);
		System.out.println(Min);
	}
	private static void comb(int s, int cnt) {
		if(cnt == N) {
			Max =Math.max(Max, s);
			Min =Math.min(s, Min);
			return;
		}
		
		for(int i =0; i< 4;i++) {
			if(op[i]>0) {
				op[i]--;
				int cal = 0;

				switch (i) {
				case 0:
					cal = s + arr[cnt];

					break;
				case 1:
					cal = s - arr[cnt];

					break;
				case 2:
					cal = s * arr[cnt];
					break;
				case 3:
					cal = s / arr[cnt];
					break;
				}
				comb( cal, cnt+1);
				op[i]++; // 백트래킹 (연산자 복구)
			}
		}
		
	}
}