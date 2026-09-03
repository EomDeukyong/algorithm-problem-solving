import java.util.Queue;
import java.util.ArrayDeque;
class Solution {
    public int solution(int[][] maps) {
        int m = maps.length;      // 행 개수
        int n = maps[0].length;   // 열 개수
        int answer = 0;
        // 상, 하, 좌, 우 이동을 위한 방향 배열
        int[] width = {-1, 1, 0, 0};
        int[] height = {0, 0, -1, 1};
        boolean[][] visited = new boolean[m][n];
        Queue<int[]> queue = new ArrayDeque<>();
        queue.add(new int[]{1, 1, 1});
        visited[0][0]=true;
        while(!queue.isEmpty()){
            int[] pos = queue.poll();
            for(int i=0;i<=3;i++){
                int pos_w=pos[0]+width[i];
                int pos_h=pos[1]+height[i];
                if(pos_w==n && pos_h==m){
                    return pos[2]+1;
                }
                if(0<pos_w && pos_w<=n && 0<pos_h && pos_h<=m && maps[pos_h-1][pos_w-1]!=0 && !visited[pos_h-1][pos_w-1]){
                    visited[pos_h-1][pos_w-1]=true;
                    queue.add(new int[]{pos_w,pos_h,pos[2]+1});
                }
            }
        }
        return -1;
    }

}