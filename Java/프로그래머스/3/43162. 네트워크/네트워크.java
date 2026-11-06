import java.util.ArrayDeque;
import java.util.Deque;

class Solution {
    public int solution(int n, int[][] computers) {
        //컴퓨터 n 배열
        boolean[] visit = new boolean[n];
        Deque<Integer> stack = new ArrayDeque<>();
        int answer = 0;
        
        for(int i=0;i<n;i++){
            if(!visit[i]){
                visit[i]=true;
                answer+=1;
                // stack.clear();
                stack.offer(i);
                while(!stack.isEmpty()){
                    int current_com=stack.poll();
                    for(int j=0;j<n;j++){
                        if(!visit[j] && computers[current_com][j]==1){
                            visit[j]=true;
                            stack.offer(j);
                        }
                    }
                }

            }
        }
        
        return answer;
    }
}