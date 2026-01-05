class Solution {

    public int solution(int[][] board) {

        int n = board.length;
        int m = board[0].length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {

                if (board[i][j] == 1) {

                    for (int x = i - 1; x <= i + 1; x++) {
                        for (int y = j - 1; y <= j + 1; y++) {

                            if (x < 0 || y < 0 || x >= n || y >= m) continue;

                            if (board[x][y] == 0) {
                                board[x][y] = 2;
                            }
                        }
                    }
                }
            }
        }

        int answer = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (board[i][j] == 0) answer++;
            }
        }

        return answer;
    }
}
