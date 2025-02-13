//문제: https://school.programmers.co.kr/learn/courses/30/lessons/43163
//시간: 0.64ms
//메모리: 90.7MB


import java.util.*;

class Pair {
    String str;
    int depth;

    public Pair (String str, int depth) {
        this.str = str;
        this.depth = depth;
    }
}

class Solution {
    public int answer = 0;
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

        return bfs(begin, target, words);
    }

    public int bfs(String begin, String target, String[] words) {
        Queue<Pair> queue = new LinkedList<>();
        queue.add(new Pair(begin, 0));

        while (!queue.isEmpty()) {
            Pair pair = queue.poll();
            String current = pair.str;
            int depth = pair.depth;

            if (current.equals(target)) {
                return depth;
            }

            for (int i = 0; i < words.length; i++) {
                if (!visited[i] && converted(current, words[i])) {
                    visited[i] = true;
                    queue.add(new Pair(words[i], depth + 1));
                }
            }
        }

        return 0;
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