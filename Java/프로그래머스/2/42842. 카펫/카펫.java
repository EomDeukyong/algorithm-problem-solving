class Solution {
    public int[] solution(int brown, int yellow) {
        // yHeight는 1부터 시작해 yellow의 제곱근까지만 확인해도 충분합니다.
        for (int yHeight = 1; yHeight * yHeight <= yellow; yHeight++) {
            // yellow의 약수인 경우만 검사
            if (yellow % yHeight == 0) {
                int yWidth = yellow / yHeight;
                
                // 테두리 갈색 개수 공식이 맞는지 확인
                if ((yWidth + 2) * (yHeight + 2) - yellow == brown) {
                    return new int[]{yWidth + 2, yHeight + 2};
                }
            }
        }
        return new int[]{};
    }
}