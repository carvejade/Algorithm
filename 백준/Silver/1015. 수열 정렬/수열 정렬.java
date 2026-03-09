import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;
 
public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
 
		int []tmp = new int [N];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < tmp.length; i++) {
			tmp[i] = Integer.parseInt(st.nextToken());
		}
		
		int [] arr = tmp.clone();
		Arrays.sort(tmp);
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if(arr[i] == tmp[j]) {
					sb.append(j).append(" ");
					tmp[j] = -1;
					break;
				}
			}
		}
		
		System.out.println(sb.toString());
	}
}