//문제 링크: https://school.programmers.co.kr/learn/courses/30/lessons/68935?language=java
//시간: 1.63ms
//메모리: 76.4MB

import java.util.*;

class Solution {
    public int solution(int n) {
        int answer = 0;
        Queue<Integer> queue = new LinkedList<>();

        // 10진법 -> 3진법
        while (n > 0) {
            queue.offer(n % 3);
            n /= 3;
        }

        String str = "";
        // 3진법 -> 앞뒤 반전 3진법
        while (!queue.isEmpty()) {
            str += queue.poll();
        }

        // 앞뒤 반전 3진법 -> 10진법
        char[] arr = str.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            int cnt = 1;
            for (int j = 1; j <= arr.length - (i + 1); j++) {
                cnt *= 3;
            }
            answer += Integer.parseInt(String.valueOf(arr[i])) * cnt;
        }

        return answer;
    }
}