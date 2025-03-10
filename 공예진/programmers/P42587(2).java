//문제 링크: https://school.programmers.co.kr/learn/courses/30/lessons/42587
//시간: 6.17ms
//메모리: 90.5MB

import java.util.*;

class Solution {
    public int solution(int[] priorities, int location) {
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < priorities.length; i++) {
            String s = Integer.toString(priorities[i]) + Integer.toString(i);
            queue.offer(Integer.parseInt(s));
        }

        Integer[] arr = Arrays.stream(priorities).boxed().toArray(Integer[]::new);
        Arrays.sort(arr, Collections.reverseOrder()); // 내림차순 정렬

        int idx = 0;
        int answer = 0;
        while (!queue.isEmpty()) {
            String str = Integer.toString(queue.poll());
            int priority = Integer.parseInt(str.substring(0, 1)); // 우선순위
            int qLocation = Integer.parseInt(str.substring(1)); // 위치

            if (priority == arr[idx]) {
                idx++;
                answer++;
                if (location == qLocation) {
                    break;
                }
            } else {
                queue.offer(Integer.parseInt(str));
            }
        }

        return answer;

    }
}