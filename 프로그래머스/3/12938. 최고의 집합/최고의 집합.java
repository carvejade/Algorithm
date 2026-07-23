import java.util.*;

class Solution {
    public int[] solution(int n, int s) {
        
        if (n > s) return new int[]{-1};
        
        int[] answer = new int[n];
        
        Arrays.fill(answer, s / n);        
        
        for(int i= s%n; i>0; i--){
        answer[i]++;
        }
        
        Arrays.sort(answer);
        return answer;
    }
}