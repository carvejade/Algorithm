import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N =Integer.parseInt(st.nextToken());
		int K =Integer.parseInt(st.nextToken());
		String str = br.readLine();
		int [] cnt = new int [K+1];
		st = new StringTokenizer(str);
		List<Integer> elc = new ArrayList<>();
		while(st.hasMoreTokens()) {
			elc.add(Integer.parseInt(st.nextToken()));
		}
		
				int count =0;
				int el;
				Set<Integer> set = new HashSet<>();
				for(int i=0; i<K;i++)  {
					el =elc.get(i);
					if(set.size()<N) {
						set.add(el);
					} else if (set.size() == N && !set.contains(el)) {
					// 멀티탭 뺄거 선택 해야함
						
						int remove = -1;
						int far =-1;;
						//set에 있는거 확인....
						for (int plug : set) {
							int next = Integer.MAX_VALUE; 
						for(int j=i+1; j<K; j++) {
							if(elc.get(j)==plug) {
								next =j;
								break;
							}
						}
								if(next>far) {
									far =next;
									remove =plug;
								}
						}
						set.remove(remove);
						count++;
						set.add(el);
					}
				}
					System.out.println(count);

	}

}
