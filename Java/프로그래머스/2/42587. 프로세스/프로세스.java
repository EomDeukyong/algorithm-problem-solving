import java.util.Deque;
import java.util.ArrayDeque;
import java.util.PriorityQueue;
import java.util.Collections;

class Solution {
    public int solution(int[] priorities, int location) {
        int answer = 0;
        
        Deque<Integer> deq = new ArrayDeque<>();
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        
        for(int num:priorities){
            maxHeap.offer(num);
        }
        for(int num=0;num<priorities.length;num++){
            deq.offer(num);
        }
        while(true){
            int top = deq.poll();
            if(priorities[top]==maxHeap.peek()){
                answer+=1;
                if(top==location){
                    break;
                }
                maxHeap.poll();
            } else { 
                deq.offer(top);
            }
        }       
        
        return answer;
    }
}