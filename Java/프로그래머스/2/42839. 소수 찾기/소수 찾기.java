import java.util.HashSet;

class Solution {
    HashSet<Integer> gen_number = new HashSet<>();
    public int solution(String numbers) {
    
        for(int i=1;i<=numbers.length();i++){
            dfs("", numbers, new boolean[numbers.length()], i,0);
        }
        
        int answer = 0;
        for (int num : gen_number) {
            if (isPrime(num)) {
                answer++;
            }
        }
        System.out.println(gen_number);
        return answer;
    }
    //숫자 조합 생성 
    public void dfs(String current, String numbers, boolean[] visited, int target_length, int current_length){
        if(target_length==current_length){
            gen_number.add(Integer.parseInt(current));
            return;
        }
        for(int i=0;i<numbers.length();i++){
            if(!visited[i]){
                visited[i]=true;
                dfs(current+numbers.charAt(i),numbers,visited,target_length,current_length+1);
                visited[i]=false;
            }
        }
    }
    
    //소수검사
    public boolean isPrime(int number){
        if (number < 2) return false;
        for(int i=2;i<=Math.sqrt(number);i++){
            if(number%i==0){
                return false;
            }
        }
        return true;
    }

}