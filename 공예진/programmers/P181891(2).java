//문제: https://school.programmers.co.kr/learn/courses/30/lessons/181891
//시간: 0.04ms
//메모리: 90.5MB

import java.util.*;

class Solution {
    public int[] solution(int[] num_list, int n) {
        int idx = 0;
        int[] answer = new int[num_list.length];
        for (int i = n; i < num_list.length; i++) {
            answer[idx++] = num_list[i];
        }

        for (int i = 0; i < n; i++) {
            answer[idx++] = num_list[i];
        }

        return answer;
    }
}