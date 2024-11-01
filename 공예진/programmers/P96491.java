//문제 링크: https://school.programmers.co.kr/learn/courses/30/lessons/86491
//시간: 3.04ms
//메모리: 84MB

import java.util.*;

class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;

        int small = 0;
        int big = 0;

        for (int i = 0; i < sizes.length; i++) {
            Arrays.sort(sizes[i]);
            small = sizes[i][0] < small ? small : sizes[i][0];
            big = sizes[i][1] > big ? sizes[i][1] : big;
        }

        answer = small * big;
        return answer;
    }
}