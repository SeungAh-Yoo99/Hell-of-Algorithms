// 문제 링크: https://school.programmers.co.kr/learn/courses/30/lessons/43162?language=java
// 시간: 0.21ms
// 메모리: 74.6MB

import java.util.*;

class Solution {
    int len;
    boolean[] visited;
    int[][] _computers;
    
    public int solution(int n, int[][] computers) {
        int answer = 0;
        len = computers.length;
        visited = new boolean[len];
        _computers = computers;
        
        for (int i = 0; i < len; i++) {
            if (!visited[i]) {
                bfs(i);
                answer++;
            }
        }
        
        return answer;
    }
    
    public void bfs(int start) {
        Queue<Integer> q = new LinkedList<>();
        q.add(start);
        visited[start] = true;
        
        while (!q.isEmpty()) {
            int pop = q.remove();
            
            for (int i = 0; i < len; i++) {
                if (_computers[pop][i] == 1 && !visited[i]) {
                    q.add(i);
                    visited[i] = true;
                }
            }
        }
    }
}
