//문제: https://school.programmers.co.kr/learn/courses/30/lessons/181853
//시간: 0.73ms
//메모리: 74.3MB

import java.util.*;

class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[5];
        Arrays.sort(num_list);

        for (int i = 0; i < 5; i++) {
            answer[i] = num_list[i];
        }

        return answer;
    }
}