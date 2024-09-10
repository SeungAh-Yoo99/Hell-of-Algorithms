// 문제 링크: https://school.programmers.co.kr/learn/courses/30/lessons/42889
// 시간: 159.20ms
// 메모리: 88.9MB

import java.util.*;

class Solution {
    class Node implements Comparable<Node> {
        int stage;
        float rate;
        
        Node(int stage, float rate) {
            this.stage = stage;
            this.rate = rate;
        }
        
        @Override
        public int compareTo(Node other) {
		        // Float.compare 처음 알았음
            if (Float.compare(other.rate, this.rate) == 0) {
                return this.stage - other.stage;
            }
            return Float.compare(other.rate, this.rate);
        }
    }
    
    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        int[] parent = new int[N + 1]; // 분모: 현재 스테이지보다 같거나 큰 것의 수
        int[] child = new int[N + 1]; // 분자: 현재 스테이지와 같은 수
        
        for (int stage : stages) {
            for (int i = 1; i <= N; i++) {
                if (stage >= i) parent[i]++;
                if (stage == i) child[i]++;
            }
        }
        
        Node[] nodes = new Node[N];
        
        for (int i = 0; i < N; i++) {
            nodes[i] = new Node(i + 1, parent[i + 1] == 0 
                                ? 0 : (float) child[i + 1] / parent[i + 1]);
        }
        
        Arrays.sort(nodes);
        
        for (int i = 0; i < N; i++) {
            answer[i] = nodes[i].stage;
        }
        
        return answer;
    }
}
