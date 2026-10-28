import java.util.HashMap;

class Solution {
    public int solution(String[][] clothes) {
        HashMap<String,Integer> map = new HashMap<>(); 
        int answer = 1;
        for (String[] str : clothes){
            map.put(str[1], map.getOrDefault(str[1],0)+1);
        }
        for (int count : map.values()) {
            answer *= (count + 1);
        }
        answer-=1;
        return answer;
    }
}
