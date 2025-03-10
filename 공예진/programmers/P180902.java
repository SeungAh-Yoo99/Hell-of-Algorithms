//문제 링크: https://school.programmers.co.kr/learn/courses/30/lessons/42586
//시간: 0.11ms
//메모리: 82.4MB

import java.util.*;

class Solution {
    public int[] solution(String my_string) {
        int[] answer = new int[52];
        Arrays.fill(answer, 0);

        for (int i = 0; i < my_string.length(); i++) {
            char c = my_string.charAt(i);
            if (c >= 'a') {
                answer[(c - 'a' + 26)]++;
            } else if (c >= 'A') {
                answer[(c - 'A')]++;
            }
        }
        return answer;
    }
}