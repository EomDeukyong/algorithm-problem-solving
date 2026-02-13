class Solution {
    public String solution(int[] numbers, String hand) {
        int l_hand=10,r_hand=12;
        String answer = "";
        for(int i=0; i<numbers.length;i++){
            if(numbers[i]==1 || numbers[i]==4 || numbers[i]==7){
                answer=answer+"L";
                l_hand=numbers[i];
            } else if(numbers[i]==3 || numbers[i]==6 || numbers[i]==9){
                answer=answer+"R";
                r_hand=numbers[i];
            } else {
                if(numbers[i]==0){
                    numbers[i]=11;
                } 
                int leftDistance = Math.abs(numbers[i] - l_hand) / 3 + Math.abs(numbers[i] - l_hand) % 3;
                int rightDistance = Math.abs(numbers[i] - r_hand) / 3 + Math.abs(numbers[i] - r_hand) % 3;
                // 왼손이 가까운 경우
                if (leftDistance < rightDistance) {
                    answer += "L";
                    l_hand = numbers[i];
                // 오른손이 가까운 경우
                } else if (leftDistance > rightDistance) {
                    answer += "R";
                    r_hand = numbers[i];
                // 거리가 같은 경우
                } else {
                    // 왼손잡이인 경우
                    if (hand.equals("left")) {
                        answer += "L";
                        l_hand = numbers[i];
                    // 오른손잡이인 경우
                    } else {
                        answer += "R";
                        r_hand = numbers[i];
                    }
                }
            }
        }
        return answer;
    }
}