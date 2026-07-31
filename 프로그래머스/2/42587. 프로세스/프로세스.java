import java.util.*;

class Solution {
    public int solution(int[] priorities, int location) {
        int answer = 0;
        PriorityQueue< Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        Queue<int[]> q = new ArrayDeque<>(); // loc pri 함께
        
        for(int i =0; i<priorities.length; i++){
            pq.offer(priorities[i]);
            q.offer(new int[]{i, priorities[i]});
        }
        while(!q.isEmpty()){
            int[] cur = q.poll();
            int idx = cur[0];
            int pri = cur[1];
            
            if(pri < pq.peek()){
                q.offer(cur);
            }else{
                pq.poll();
                answer++;
                
                if(idx == location){
                    return answer;
                }
            }
        }
        
        return answer;
    }
}
