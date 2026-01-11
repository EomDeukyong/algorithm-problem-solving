import java.util.*;

public class Solution {
    public int[] solution(int[] arr) {

        // 대략 arr 길이만큼 나올 수 있으니 capacity 힌트 주면 더 좋음(선택)
        ArrayList<Integer> list = new ArrayList<>(arr.length);

        int before = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != before) {
                list.add(arr[i]);   // append
                before = arr[i];
            }
        }

        // ArrayList<Integer> -> int[]
        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }
}