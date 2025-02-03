//문제 링크: https://school.programmers.co.kr/learn/courses/30/lessons/135808
//시간: 343.28ms
//메모리: 164MB

import java.util.*;

class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;

        // score 내림차순으로 정렬
        Integer[] arr = Arrays.stream(score).boxed().toArray(Integer[]::new);
        Arrays.sort(arr, (a, b) -> b - a);

        for (int i = 0; i < arr.length; i++) {
            if ((i + 1) % m == 0 && i != 0) {
                answer += arr[i] * m;
            }
        }

        return answer;
    }
}