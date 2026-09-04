import java.util.*;
class Solution {
    public int[] solution(int[] answers) {
        int[] score = new int[]{0,0,0};
        int[] person1 = new int[]{1, 2, 3, 4, 5};
        int[] person2 = new int[]{2, 1, 2, 3, 2, 4, 2, 5, 2, 1, 2, 3, 2, 4, 2, 5};
        int[] person3 = new int[]{3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        for(int i=0;i<answers.length;i++){
            if(answers[i]==person1[i%5]){
                score[0]+=1;
            }
            if(answers[i]==person2[i%8]){
                score[1]+=1;
            }
            if(answers[i]==person3[i%10]){
                score[2]+=1;
            }
        }
        
        int maxScore = Math.max(score[0], Math.max(score[1], score[2]));
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            if (score[i] == maxScore) {
                list.add(i + 1);
            }
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}