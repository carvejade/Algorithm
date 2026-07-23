class Solution {
    static final int MOD = 1000000007;
    public int solution(int n) {
        if (n%2 == 1) return 0;
        if (n == 2) return 3;
        
        long dp[] = new long [n+1];
        dp[0]=1;
        dp[2]=3;
        for (int i = 4; i<=n; i+=2){
            dp[i] = (4*dp[i-2] - dp[i-4]) % MOD;
            if (dp[i] < 0) dp[i] += MOD; //음수 이슈!
        }
        return (int)dp[n];
    }
}