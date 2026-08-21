class Solution {
    public int solution(int n) {
        String str = Integer.toBinaryString(n);
        int ori_count = str.length()-str.replace("1","").length();  
        while(true){
            n+=1;
            str = Integer.toBinaryString(n);
            int count = str.length()-str.replace("1","").length();  
            if(count==ori_count){
                break;
            }
        }
        int answer = n;
        return answer;
    }
}