class Solution {
    public int[] solution(String s) {
        int[] answer = {0,0};
        while(s.length()>1){
            int temp=s.length();
            s = s.replace("0","");
            answer[1]+=temp-s.length();
            s = Integer.toBinaryString(s.length());
            answer[0]+=1;
        }
        
        return answer;
    }
}