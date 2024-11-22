//문제 링크: https://school.programmers.co.kr/learn/courses/30/lessons/12982?language=java
//시간: 0.65ms
//메모리: 76.6MB

import java.util.*;

class Solution {
    public int solution(int[] d, int budget) {
        int answer = 0;

        Arrays.sort(d);
        for (int m : d) {
            if (budget - m >= 0) {
                budget -= m;
                answer++;
            } else {
                break;
            }
        }
        return answer;
    }
}