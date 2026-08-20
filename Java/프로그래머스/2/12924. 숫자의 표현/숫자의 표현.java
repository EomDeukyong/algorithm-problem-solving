class Solution {
    public int solution(int n) {
        int answer = 0;
        for(int i=n;i>0;i--){
            int temp=n;
            for(int i2=i;i2>0;i2--){
                temp-=i2;             
                if(temp==0){
                    answer+=1;
                    break;
                } else if (temp<0){
                    break;
                }
            }
        }
        return answer;
    }
}