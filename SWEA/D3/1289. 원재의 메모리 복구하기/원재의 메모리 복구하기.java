import java.util.Scanner;

class Solution
{
	public static void main(String args[]) throws Exception
{
        Scanner sc = new Scanner(System.in);
        int T;
        T=sc.nextInt();
        for(int tc = 1; tc <T+1; tc++){
            String s = sc.next();
            int cnt =0;
            for(int i =0; i<s.length(); i++){
                if(i >0){
                    if(s.charAt(i) != s.charAt(i-1)) cnt++;
                }else if(s.charAt(0) == '1') cnt++;
            }
            System.out.println("#"+tc+" "+cnt);
        }
    }
}
