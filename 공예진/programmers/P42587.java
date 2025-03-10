//문제 링크: https://school.programmers.co.kr/learn/courses/30/lessons/42587
//시간: 1.74ms
//메모리: 81.4MB

import java.util.*;
import java.io.*;

class Solution {
    public int solution(int[] priorities, int location) {
        Queue<int[]> queue = new LinkedList<>();
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        for (int i = 0; i < priorities.length; i++) {
            queue.add(new int[] {priorities[i], i}); // (우선순위, 인덱스)
            pq.add(priorities[i]);
        }

        int cnt = 0;

        while (!queue.isEmpty()) {
            int[] selected = queue.poll();

            if (selected[0] == pq.peek()) {
                pq.poll();
                cnt++;

                if (selected[1] == location) {
                    break;
                }
            } else {
                queue.add(selected);
            }
        }
        return cnt;
    }
}