class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        int q = x;
        int sum =0;
        while(q>10){
            sum += (q%10);
            q /=10;
        } 
        sum+=q;
        if(x%sum != 0){
            return false;
        }
        return answer;
    }
}