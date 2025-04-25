//문제: https://school.programmers.co.kr/learn/courses/30/lessons/43163
//시간: 0.18ms
//메모리: 87.1MB

import java.util.*;

class Solution {
    public int answer = 100;
    public boolean[] visited;

    public int solution(String begin, String target, String[] words) {
        visited = new boolean[words.length];
        boolean isPossible = false;

        for (String str : words) {
            if (str.equals(target)) {
                isPossible = true;
                break;
            }
        }

        if (!isPossible) {
            return 0;
        }

        dfs(begin, target, words, 0);

        return answer;
    }

    public void dfs(String current, String target, String[] words, int depth) {
        // target과 일치하면 최소 변환 횟수 저장
        if (current.equals(target)) {
            answer = Math.min(depth, answer);
            return;
        }

        for (int i = 0; i < words.length; i++) {
            if (!visited[i] && converted(current, words[i])) {
                visited[i] = true;
                dfs(words[i], target, words, depth + 1);
                visited[i] = false;
            }
        }
    }

    public boolean converted(String current, String word) {
        int cnt = 0;
        for (int i = 0; i < current.length(); i++) {
            if (current.charAt(i) != word.charAt(i)) {
                cnt++;
            }

            if (cnt > 1) {
                return false;
            }
        }
        return cnt == 1;
    }

}