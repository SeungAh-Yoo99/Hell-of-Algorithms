//문제 링크: https://school.programmers.co.kr/learn/courses/30/lessons/181886
//시간: 0.39ms
//메모리: 85.6MB

import java.util.*;

class Solution {
    public String[] solution(String[] names) {
        String[] answer = new String[(int) Math.ceil((double) names.length / 5)];
        int idx = 0;
        for (int i = 0; i < names.length; i+=5) {
            answer[idx++] = names[i];
        }
        return answer;
    }
}