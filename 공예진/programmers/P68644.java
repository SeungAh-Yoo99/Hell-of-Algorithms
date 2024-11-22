//문제 링크: https://school.programmers.co.kr/learn/courses/30/lessons/68644
//시간: 1.07ms
//메모리: 74.8MB

import java.util.*;
import java.io.*;

class Solution {
    public int[] solution(int[] numbers) {
        int[] answer = {};
        HashSet<Integer> hashSet = new HashSet<>();

        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                int num = numbers[i] + numbers[j];
                hashSet.add(num);
            }
        }

        answer = new int[hashSet.size()];
        int idx = 0;
        for (Integer h : hashSet) {
            answer[idx++] = h;
        }

        Arrays.sort(answer);

        return answer;
    }
}