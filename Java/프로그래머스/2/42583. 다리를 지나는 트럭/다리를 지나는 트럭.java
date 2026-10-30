import java.util.ArrayDeque;
import java.util.Deque;

class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        Deque<Integer> bridge_queue = new ArrayDeque<>();
        int time=0;
        int sum=0;
        for (int i=0;i<bridge_length;i++){
            bridge_queue.offer(0);
        }
        
        for (int truck:truck_weights){
            while(true){
                time+=1;
                //다리 통과
                sum-=bridge_queue.poll();
                
                if(sum+truck<=weight){
                    sum+=truck;
                    bridge_queue.offer(truck);
                    break;
                } else {
                    bridge_queue.offer(0);
                }
            }
        }
        time+=bridge_length;
        int answer = time;
        
        return answer;
    }
}