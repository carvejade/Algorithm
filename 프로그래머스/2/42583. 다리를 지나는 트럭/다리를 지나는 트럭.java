import java.util.*;

class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;
        Queue<Integer> br = new ArrayDeque<>();

        for (int i = 0; i < bridge_length; i++) {
            br.offer(0);
        }
        
        int time = 0;
        int bw = 0; //bridge_Weight
        int idx = 0;
        while(idx<truck_weights.length){
            
            time ++;
            bw -= br.poll();
            int truck = truck_weights[idx];
            
            if(bw + truck <= weight){
                br.offer(truck);
                bw += truck;
                idx++;
            }else{
                br.offer(0);
                
            }
        }

        answer = time+bridge_length;
        return answer;
    }
}