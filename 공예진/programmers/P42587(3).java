//문제 링크: https://school.programmers.co.kr/learn/courses/30/lessons/42587
//시간: 19.48ms
//메모리: 79.3MB

import java.util.*;

class Solution {
    public int solution(int[] priorities, int location) {
        Queue<String> queue = new LinkedList<>();
        for (int i = 0; i < priorities.length; i++) {
            String s = priorities[i] + "," + i;
            queue.offer(s);
        }

        Integer[] arr = Arrays.stream(priorities).boxed().toArray(Integer[]::new);
        Arrays.sort(arr, Collections.reverseOrder()); // 내림차순 정렬

        int idx = 0;
        int answer = 0;
        while (!queue.isEmpty()) {
            String str = queue.poll();
            String[] strArr = str.split(",");
            int priority = Integer.parseInt(strArr[0]); // 우선순위
            int qLocation = Integer.parseInt(strArr[1]); // 위치

            if (priority == arr[idx]) {
                idx++;
                answer++;
                if (location == qLocation) {
                    break;
                }
            } else {
                queue.offer(str);
            }
        }

        return answer;

    }
}