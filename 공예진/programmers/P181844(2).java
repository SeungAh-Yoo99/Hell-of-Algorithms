//문제: https://school.programmers.co.kr/learn/courses/30/lessons/181844
//시간: 0.59ms
//메모리: 90.1MB

import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        List<Integer> list = new ArrayList<>();
        for (int a : arr) {
            list.add(a);
        }

        for (int d : delete_list) {
            list.remove((Integer)d);
        }

        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }
}