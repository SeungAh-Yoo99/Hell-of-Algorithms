//문제: https://school.programmers.co.kr/learn/courses/30/lessons/181868
//시간: 0.36ms
//메모리: 82.5MB

import java.util.*;

class Solution {
    public String[] solution(String my_string) {
        StringTokenizer st = new StringTokenizer(my_string);
        String[] answer = new String[st.countTokens()];
        int idx = 0;
        while (st.hasMoreTokens()) {
            answer[idx++] = st.nextToken();
        }
        return answer;
    }
}