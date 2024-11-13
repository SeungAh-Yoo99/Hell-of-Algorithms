//문제 링크: https://school.programmers.co.kr/learn/courses/30/lessons/138477
//시간: 2.19ms
//메모리: 74.9MB

import java.util.*;

class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        for (int i = 0; i < score.length; i++) {
            int num = score[i];
            queue.offer(num);
            if (queue.size() > k) {
                queue.poll();
            }
            answer[i] = queue.peek();
        }
        return answer;
    }
}