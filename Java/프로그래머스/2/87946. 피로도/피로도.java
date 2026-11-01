import java.util.Arrays;
class Solution {
    int max=0;
    public int solution(int k, int[][] dungeons) {
        dfs(new boolean[dungeons.length], k, 0, dungeons);
        int answer = max;
        return answer;
    }
    
    public void dfs(boolean[] visited, int current, int count, int[][] dungeons){
        if(max<count){
            max=count;
        }
        for(int i=0; i<dungeons.length;i++){
            if(!visited[i] && dungeons[i][0]<=current){
                count++;
                current=current-dungeons[i][1];
                visited[i]=true;
                dfs(visited,current,count,dungeons);
                count--;
                current=current+dungeons[i][1];
                visited[i]=false;
            } 
        }
    }
}