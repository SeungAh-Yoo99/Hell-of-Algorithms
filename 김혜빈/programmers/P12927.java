package 김혜빈.programmers;

// 문제 링크: https://school.programmers.co.kr/learn/courses/30/lessons/12927

import java.util.*;

public class P12927 {
    public long solution(int n, int[] works) {
        long answer = 0;

        Queue<Integer> heap = new PriorityQueue<>(Collections.reverseOrder());
        for (int x : works) heap.add(x);

        for (int i = 0; i < n; i++) {
            int max = heap.poll(); // works 에서 최댓값을 찾기
            if (max == 0) break;
            max -= 1;
            heap.add(max); // 다시 works 에 넣기
        }

        while (!heap.isEmpty()) {
            int i = heap.poll();
            answer += (i * i);
        }

        return answer;
    }
}
