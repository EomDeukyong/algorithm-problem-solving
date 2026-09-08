import java.util.Arrays;
class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        Arrays.sort(lost);
        Arrays.sort(reserve);
        
        int answer = n-lost.length;
        
        for (int i = 0; i < lost.length; i++) {
            for (int j = 0; j < reserve.length; j++) {
                if (lost[i] == reserve[j]) {
                    answer++; 
                    lost[i] = -1; 
                    reserve[j] = -1;
                    break;
                }
            }
        }
        
        for(int i : lost){
            if (i==-1) continue;
            
            for(int i2=0;i2<reserve.length;i2++){
                if(i - 1 <= reserve[i2] && reserve[i2] <= i + 1){
                    reserve[i2]=-1;
                    answer+=1;
                    break;
                }
            }
        }
        return answer;
    }
}