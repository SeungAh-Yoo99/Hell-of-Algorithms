//문제: https://school.programmers.co.kr/learn/courses/30/lessons/181888
//시간: 3.16ms
//메모리: 84.9MB

import java.util.*;

class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] answer = new int[(int) Math.ceil((double) num_list.length / n)];

        int idx = 0;
        for (int i = 0; i < num_list.length; i+=n) {
            answer[idx++] = num_list[i];
        }
        return answer;
    }
}