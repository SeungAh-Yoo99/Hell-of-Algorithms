//문제: https://school.programmers.co.kr/learn/courses/30/lessons/43162
//시간: 0.30ms
//메모리: 75MB

class Solution {
    static boolean[] visited;

    public int solution(int n, int[][] computers) {
        int answer = 0;
        visited = new boolean[n];

        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                dfs(computers, n, i);
                answer++;
            }
        }
        return answer;
    }

    public void dfs(int[][] computers, int n, int start) {
        visited[start] = true;
        for (int i = 0; i < n; i++) {
            if (i == start) continue;
            if (!visited[i] && computers[start][i] == 1) {
                dfs(computers, n, i);
            }
        }
    }
}