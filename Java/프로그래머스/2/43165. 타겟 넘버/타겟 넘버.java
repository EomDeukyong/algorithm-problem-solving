import java.util.ArrayList;

class Solution {
    public int solution(int[] numbers, int target) {
        ArrayList<Integer> storage = new ArrayList<>();
        storage.add(0);

        for (int num : numbers) {
            ArrayList<Integer> nextStorage = new ArrayList<>();
            for (int sum : storage) {
                nextStorage.add(sum + num);
                nextStorage.add(sum - num);
            }
            storage = nextStorage;
        }

        int answer = 0;
        for (int sum : storage) {
            if (sum == target) {
                answer++;
            }
        }

        return answer;
    }
}