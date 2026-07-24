import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        
        HashMap<String,Integer> m = new HashMap<>();
        
        for(String p : participant){
        m.put(p,m.getOrDefault(p, 0) + 1);
        } //map.getOrDefault 기본값설정하고 +1 (존재x)
        
        for(String c : completion){
        m.put(c,m.get(c)-1);
        }
        
        for(String k : m.keySet()){
        if(m.get(k) !=0) return k;
        }

        return answer;
    }
}