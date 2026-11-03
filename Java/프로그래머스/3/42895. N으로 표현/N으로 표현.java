import java.util.HashSet;

class Solution {
    public int solution(int N, int number) {
        if (N==number) return 1;
        
        HashSet<Integer>[] dp = new HashSet[9];
        for (int i = 1; i <= 8; i++) {
            dp[i] = new HashSet<>();
        }
        
        int currentNumber = 0;
        for (int i = 1; i <= 8; i++) {
            currentNumber = currentNumber * 10 + N;
            dp[i].add(currentNumber);
        }
        
        for(int i=2;i<=8;i++){
            //dp[2~8] 채워넣기
            for(int j=1;j<i;j++){
                //dp[j] 보다 작은 수 돌기
                // dp[j] dp[i-j]
                for(int num:dp[j]){
                    for(int num2:dp[i-j]){
                        dp[i].add(num+num2);
                        dp[i].add(num-num2);
                        dp[i].add(num*num2);
                        if(num2!=0){
                            dp[i].add(num/num2);
                        }
                    }
                }
            }
            if(dp[i].contains(number)){
                return i;
            }
        }

        int answer = -1;
        return answer;
    }
}