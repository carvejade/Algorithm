class Solution {
    public int solution(int n) {
        int answer = 0;
        int cnt = Integer.bitCount(n);
        int num = n;
        num++;
        while(cnt != Integer.bitCount(num) ){
            num++;
        }
        return num;
        
    }
}