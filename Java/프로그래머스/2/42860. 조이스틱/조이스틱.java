class Solution {
    public int solution(String name) {
        int length = name.length();
        int changeCount = 0;

        for (int i = 0; i < length; i++) {
            char ch = name.charAt(i);

            int up = ch - 'A';
            int down = 'Z' - ch + 1;

            changeCount += Math.min(up, down);
        }

        int minMove = length - 1;

        int index = 0;

        while (index < length) {
            if (name.charAt(index) != 'A') {
                index++;
                continue;
            }

            int start = index;

            while (index < length && name.charAt(index) == 'A') {
                index++;
            }

            int end = index;
            int rightDistance = Math.max(0, start - 1);
            int leftDistance = length - end;
            int rightFirst = rightDistance * 2 + leftDistance;
            int leftFirst = leftDistance * 2 + rightDistance;

            minMove = Math.min(minMove, rightFirst);
            minMove = Math.min(minMove, leftFirst);
        }

        return changeCount + minMove;
    }
}