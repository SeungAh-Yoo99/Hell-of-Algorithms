//문제: https://school.programmers.co.kr/learn/courses/30/lessons/181866
//시간: 22.80ms
//메모리: 81.5MB

import java.util.*;

class Solution {
    public String[] solution(String myString) {
        StringTokenizer st = new StringTokenizer(myString, "x");
        String[] answer = new String[st.countTokens()];
        int idx = 0;
        while (st.hasMoreTokens()) {
            answer[idx++] = st.nextToken();
        }

        Arrays.sort(answer);
        return answer;
    }
}