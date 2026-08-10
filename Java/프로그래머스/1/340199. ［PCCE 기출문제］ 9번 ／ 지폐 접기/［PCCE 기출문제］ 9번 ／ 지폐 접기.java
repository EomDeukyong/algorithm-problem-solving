class Solution {
    public int solution(int[] wallet, int[] bill) {
        int answer = 0;
        while(true){
            int w_big,b_big;
            
            if(wallet[0]>wallet[1]){
                w_big=0;
            } else {
                w_big=1;
            }
            if(bill[0]>bill[1]){
                b_big=0;
            } else {
                b_big=1;
            } 
            if(wallet[w_big]<bill[b_big]){
                bill[b_big] /= 2;
                answer+=1;
            }else if(wallet[1-w_big]<bill[1-b_big]) {
                bill[b_big]/= 2;
                answer+=1;
            }else{
                break;
            }
        }
        return answer;
    }
}