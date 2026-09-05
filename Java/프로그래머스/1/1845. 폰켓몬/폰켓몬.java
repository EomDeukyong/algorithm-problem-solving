import java.util.HashSet;
class Solution {
    public int solution(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int num : nums){
            set.add(num);
        }
        
        int max_select=nums.length/2;
        int answer = Math.min(max_select,set.size());
        return answer;
    }
}