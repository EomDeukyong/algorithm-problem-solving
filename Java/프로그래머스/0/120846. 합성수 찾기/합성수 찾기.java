class Solution {
    public int solution(int n) {
        int answer = 0;
        for(int i=1; i<=n;i++){
            int count=0;
            for(int i2=2; i2<=Math.sqrt(i);i2++){
                if(i%i2==0){
                    count=count+1;
                    break;
                }
            }
            if (count>=1){
                answer=answer+1;
            }
        }
        
        return answer;
    }
}