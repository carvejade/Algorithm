import java.util.*;

class Solution {
    //k: 최저 사과점수, m: 한 상자의 사과수, score : 점수 배열
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        
        Arrays.sort(score); // 점수 오름차순 정렬
        
        for (int i = score.length - m; i >= 0; i -= m) {
            answer += score[i] * m;
        }
        return answer;
    }
}
