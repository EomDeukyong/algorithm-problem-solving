import java.util.Arrays;
import java.util.Collections;
class Solution {
    public int solution(int[] citations) {
        int count=0;
        int answer=0;
        Arrays.sort(citations);
        for(int i=citations.length-1; i>=0 ; i--){
            count++;
            if(count>citations[i]){
                answer=count-1;
                break;
            }
            else{
                answer=count;
            }
        }
        
        return answer;
    }
}