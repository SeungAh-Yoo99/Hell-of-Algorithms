//문제: https://school.programmers.co.kr/learn/courses/30/lessons/181851
//시간: 1.07ms
//메모리: 84.8MB

import java.util.*;

class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        PriorityQueue<Integer> queue = new PriorityQueue<>((a, b) -> rank[a] - rank[b]);
        for (int i = 0; i < attendance.length; i++) {
            if (attendance[i]) {
                queue.add(i);
            }
        }

        return 10000 * queue.poll() + 100 * queue.poll() + queue.poll();
    }
}