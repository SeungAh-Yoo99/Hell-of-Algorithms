// 링크: https://school.programmers.co.kr/learn/courses/30/lessons/43238#
// 시간: 42.79ms
// 메모리: 103MB

import java.util.*;

class Solution {
    public long solution(int n, int[] times) {        
        long left = 0;
        long right = (long)times[0] * n;
        
        while (left <= right) {
            long mid = (left + right) / 2; // 시간
            
            long sum = 0; // 심사 가능한 사람 수
            for (int time : times) {
                sum += mid / time;
                if (sum >= n) break;
            }
            
            if (sum >= n) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }
}
