class Solution {
    public int solution(int chicken) {
        int answer = -1;
        //쿠폰  => 치킨 몫 + 나머지;
        // 쿠폰이 한자리수가 될때까지 해야만
        int cou = chicken; 
        int q =0;
        while(cou > 9){
            q = cou / 10;
            cou %=10;
            answer +=q;
            cou += q; 
        }
        return answer+1;
    }
}