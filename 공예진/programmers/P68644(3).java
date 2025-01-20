//문제 링크: https://school.programmers.co.kr/learn/courses/30/lessons/68644
//시간: 0.70ms
//메모리: 74.2MB

import java.util.*;
import java.io.*;

class Solution {
    public int[] solution(int[] numbers) {
        int[] answer = {};
        boolean[] check = new boolean[201];
        List<Integer> list = new ArrayList<>();
        int cnt = 0;

        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                int num = numbers[i] + numbers[j];
                if (!check[num]) {
                    check[num] = true;
                    cnt++;
                }
            }
        }

        answer = new int[cnt];
        int idx = 0;
        for (int i = 0; i < check.length; i++) {
            if (check[i]) {
                answer[idx++] = i;
            }
        }

        Arrays.sort(answer);

        return answer;
    }
}