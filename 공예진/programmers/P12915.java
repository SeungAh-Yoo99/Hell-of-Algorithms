//문제 링크: https://school.programmers.co.kr/learn/courses/30/lessons/12915
//시간: 0.61ms
//메모리: 73.7MB

import java.util.*;

class Solution {
    public String[] solution(String[] strings, int n) {
        String[] answer = new String[strings.length];
        for (int i = 0; i < strings.length; i++) {
            char ch = strings[i].charAt(n);
            answer[i] = Character.toString(ch);
        }

        Arrays.sort(answer);
        Arrays.sort(strings);
        for (int i = 0; i < strings.length; i++) {
            String st = Character.toString(strings[i].charAt(n));
            for (int j = 0; j < answer.length; j++) {
                if (st.equals(answer[j])) {
                    answer[j] = strings[i];
                    break;
                }
            }
        }
        return answer;
    }
}