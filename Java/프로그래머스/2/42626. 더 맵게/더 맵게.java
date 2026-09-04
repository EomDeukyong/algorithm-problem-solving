import java.util.PriorityQueue;

class Solution {
    public int solution(int[] scoville, int K) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        int count=0;
        for(int num:scoville){
            minHeap.add(num);
        }
        while(true){
            if(minHeap.peek()>=K){
                return count;
            }
            if(minHeap.size()<=1){
                return -1;
            }
            int num1=minHeap.poll();
            int num2=minHeap.poll();
            minHeap.add(num1+num2*2);
            count+=1;
        }
    }
}