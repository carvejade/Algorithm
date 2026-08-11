import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        StringTokenizer st = new StringTokenizer(s);
        
        int num = Integer.parseInt(st.nextToken());
        int max = num;
        int min = num;
        
        while(st.hasMoreTokens()){
            num = Integer.parseInt(st.nextToken());
            max = Math.max(max,num);
            min = Math.min(min, num);
        }
        return min +" " + max;
    }
}