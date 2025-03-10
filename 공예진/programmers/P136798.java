//문제 링크: https://school.programmers.co.kr/learn/courses/30/lessons/136798
//시간: 152.15ms
//메모리: 92.7MB

import java.util.*;

class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 0;
        int[] arr = new int[number];

        for (int i = 1; i <= number; i++) {
            int cnt = 0;

            for (int j = 1; j <= (int)Math.sqrt(i); j++) {
                if (i % j == 0) {
                    cnt++;
                    if (i / j != j) {
                        cnt++;
                    }
                }
            }

            if (cnt > limit) {
                cnt = power;
            }
            arr[i - 1] = cnt;
        }

        for (int num : arr) {
            answer += num;
        }

        return answer;
    }
}