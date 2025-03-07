//문제 링크: https://school.programmers.co.kr/learn/courses/30/lessons/68644
//시간: 8.49ms
//메모리: 87.6MB

import java.util.*;
import java.io.*;

class Solution {
    public int[] solution(int[] numbers) {
        int[] answer = {};
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                int num = numbers[i] + numbers[j];
                if (!list.contains(num)) {
                    list.add(num);
                }
            }
        }

        answer = new int[list.size()];
        int idx = 0;
        for (int l : list) {
            answer[idx++] = l;
        }

        Arrays.sort(answer);

        return answer;
    }
}