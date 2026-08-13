import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        s = s.toLowerCase();
        String[] words = s.split(" ", -1);
        
        for (int i = 0; i < words.length; i++) {
            String word = words[i];

            if (!word.isEmpty()) {
                answer += word.substring(0, 1).toUpperCase()
                        + word.substring(1);
            }

            // 마지막 요소가 아니면 원래 구분자였던 공백 복원
            if (i < words.length - 1) {
                answer += " ";
            }
        }
        
        return answer;
    }
}