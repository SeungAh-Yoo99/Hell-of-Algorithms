//문제: https://school.programmers.co.kr/learn/courses/30/lessons/181861
//시간: 0.16ms
//메모리: 92.6MB

import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        int size = 0;
        for (int num : arr) {
            size += num;
        }

        int[] answer = new int[size];
        int idx = 0;
        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
            for (int j = 0; j < num; j++) {
                answer[idx++] = num;
            }
        }

        return answer;
    }
}