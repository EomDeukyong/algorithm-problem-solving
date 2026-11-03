class Solution {
    public int solution(int[][] triangle) {

        for(int i=triangle.length-2;i>=0;i--){
            for(int i2=0;i2<triangle[i].length;i2++){
                triangle[i][i2]+=Math.max(triangle[i+1][i2],triangle[i+1][i2+1]);
            }
        }
        
        return triangle[0][0];
    }
}