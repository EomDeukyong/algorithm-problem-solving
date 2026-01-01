import java.util.Arrays;
class Solution {
    int answer = 0;
    int beforeNum = 0;
    public int solution(String s) {
        String[] splitStr = s.split(" ");
        for(int i=0; i<splitStr.length; i++){
            if(splitStr[i].equals("Z")){
                answer=answer-beforeNum;
            } else {
                beforeNum=Integer.parseInt(splitStr[i]);
                answer=answer+beforeNum;
            }
        }
        
        return answer;
    }
}