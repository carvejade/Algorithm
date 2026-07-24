import java.util.*;

class Solution {
    boolean solution(String s) {
        boolean answer = true;
        if(s.length()%2 == 1)answer = false; 
        
        int cnt = 0; //스택 안써도
        for(int i =0; i < s.length(); i++){
            char c = s.charAt(i);
            if( c == '('){
                cnt++;
            }else{
                if(cnt == 0) return false;
                cnt--;
            }            
        }
        
        return cnt == 0;
    }
}