import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		String s = st.nextToken().toLowerCase() + ' ';
		int n = Integer.parseInt(st.nextToken());
		
		boolean[] alphabet = new boolean[26];
		
		char c = s.charAt(0);
		int cnt = 1;
		StringBuilder sb = new StringBuilder();
		for(char ch : s.toCharArray()) {
			if(ch == c) {
				cnt++;
			}
			else {
				if(!alphabet[c - 'a']) {
					sb.append(cnt >= n ? 1 : 0);
					alphabet[c - 'a'] = true;
				}
				
				c = ch;
				cnt = 1;
			}
		}
		
		System.out.print(sb);
	}
}