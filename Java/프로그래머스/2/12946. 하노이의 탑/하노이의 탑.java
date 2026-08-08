class Solution {
    public int[][] solution(int n) {
        // n = 1 일 때의 기본값
        int[][] ans = {{1, 3}};

        // n = 2부터 n까지 규칙 적용
        for (int i = 2; i <= n; i++) {
            int prevLen = ans.length;
            int[][] nextAns = new int[prevLen * 2 + 1][2];

            // 1. 앞부분: 이전 경로의 (2 <-> 3) 반전
            for (int j = 0; j < prevLen; j++) {
                nextAns[j][0] = invert23(ans[j][0]);
                nextAns[j][1] = invert23(ans[j][1]);
            }

            // 2. 중간: 제일 큰 원판 이동 [1, 3]
            nextAns[prevLen][0] = 1;
            nextAns[prevLen][1] = 3;

            // 3. 뒷부분: 이전 경로의 (1 <-> 2) 반전
            for (int j = 0; j < prevLen; j++) {
                nextAns[prevLen + 1 + j][0] = invert12(ans[j][0]);
                nextAns[prevLen + 1 + j][1] = invert12(ans[j][1]);
            }

            ans = nextAns;
        }

        return ans;
    }

    // 2 <-> 3 반전 메서드 (1은 유지)
    private int invert23(int val) {
        if (val == 2) return 3;
        if (val == 3) return 2;
        return val;
    }

    // 1 <-> 2 반전 메서드 (3은 유지)
    private int invert12(int val) {
        if (val == 1) return 2;
        if (val == 2) return 1;
        return val;
    }
}