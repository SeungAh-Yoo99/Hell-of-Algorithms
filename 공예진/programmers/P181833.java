//문제: https://school.programmers.co.kr/learn/courses/30/lessons/181833
//시간: 0.28ms
//메모리: 94.9MB

class Solution {
    public int[][] solution(int n) {
        int[][] answer = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    answer[i][j] = 1;
                } else {
                    answer[i][j] = 0;
                }
            }
        }
        return answer;
    }
}