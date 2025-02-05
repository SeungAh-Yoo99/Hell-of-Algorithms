//문제: https://school.programmers.co.kr/learn/courses/30/lessons/42626
//시간: 2.47ms
//메모리: 91.8MB

import java.util.*;

class Solution {
    public int solution(int[] scoville, int K) {
        int answer = 0;

        PriorityQueue<Integer> queue = new PriorityQueue<>();
        for(int i = 0; i < scoville.length; i++) {
            queue.offer(scoville[i]);
        }


        while (queue.size() > 1 && queue.peek() < K) {
            int first = queue.poll();
            int second = queue.poll();
            queue.offer(first + (second * 2));
            answer++;
        }

        if (queue.peek() < K) {
            answer = -1;
        }

        return answer;
    }
}