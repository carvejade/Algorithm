import java.util.*;

class Solution {
    boolean solution(String s) {
        if (s.length() % 2 == 1) return false; 
        
        Stack<Character> bra = new Stack<>();
        
        // 문자열을 char 배열로 바꾸어 반복문 돌리기
        for (char c : s.toCharArray()) {
            if (c == '(') {
                bra.push(c); 
            } else { 
                if (bra.isEmpty()) { 
                    return false;
                }
                bra.pop(); 
            }
        }
        
        return bra.isEmpty();
    }
}