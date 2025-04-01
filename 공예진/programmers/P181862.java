//문제: https://school.programmers.co.kr/learn/courses/30/lessons/181862
//시간: 81.49ms
//메모리: 115MB

import java.util.*;

class Solution {
    public String[] solution(String myStr) {
        String[] answer = {};
        String[] abc = {"a", "b", "c"};
        StringBuilder sb;
        for (int i = 0; i < abc.length; i++) {
            String[] str = myStr.split(abc[i]);
            myStr = String.join("-", str);
        }

        StringTokenizer st = new StringTokenizer(myStr, "-");
        answer = new String[st.countTokens()];
        int idx = 0;
        while(st.hasMoreTokens()) {
            answer[idx++] = st.nextToken();
        }
        return (answer.length == 0) ? new String[]{"EMPTY"} : answer;
    }
}