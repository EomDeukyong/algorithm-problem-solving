import java.util.ArrayList;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        ArrayList<Integer> answer = new ArrayList<>();
        int before_day=0;
        int count=1;
        for(int i=0;i<progresses.length;i++){
            int deploy_day=(100 - progresses[i] + speeds[i] - 1) / speeds[i];
            if (before_day == 0) {
                before_day = deploy_day;
                count = 1;
            } else if (deploy_day <= before_day) {
                count++;
            } else {
                answer.add(count);
                before_day = deploy_day;
                count = 1;
            }
        }
        answer.add(count);
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}