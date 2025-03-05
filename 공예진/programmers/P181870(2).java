//문제: https://school.programmers.co.kr/learn/courses/30/lessons/181870
//시간: 0.81ms
//메모리: 87.1MB

import java.util.*;

class Solution {
    public String[] solution(String[] strArr) {
        List<String> list = new ArrayList<>();
        for (String str : strArr) {
            if (!str.contains("ad")) {
                list.add(str);
            }
        }

        String[] answer = new String[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }
}