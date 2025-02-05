//문제: https://school.programmers.co.kr/learn/courses/30/lessons/181895
//시간: 8.82ms
//메모리: 93.3MB

import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[][] intervals) {
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < 2; i++) {
            int a = intervals[i][0];
            int b = intervals[i][1];

            for (int j = a; j <= b; j++) {
                list.add(arr[j]);
            }
        }

        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }
}