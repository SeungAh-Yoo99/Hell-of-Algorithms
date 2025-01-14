//문제 링크: https://school.programmers.co.kr/learn/courses/30/lessons/42586
//시간: 0.44ms
//메모리: 77.6MB

import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {

        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < speeds.length; i++) {
            queue.add((int) Math.ceil((100.0 - progresses[i]) / speeds[i]));
        }

        List<Integer> list = new ArrayList<>();
        while (!queue.isEmpty()) {
            int q = queue.poll();
            int cnt = 1;
            while (!queue.isEmpty() && queue.peek() <= q) {
                cnt++;
                queue.poll();
            }
            list.add(cnt);
        }

        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }
}