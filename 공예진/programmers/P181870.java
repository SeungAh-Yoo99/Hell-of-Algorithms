//문제: https://school.programmers.co.kr/learn/courses/30/lessons/181870
//시간: 5.42ms
//메모리: 76.1MB

import java.util.*;

class Solution {
    public String[] solution(String[] strArr) {
        List<String> list = new ArrayList<>();
        for (String str : strArr) {
            for (int i = 0; i < str.length(); i++) {
                if (str.substring(i).startsWith("ad")) {
                    System.out.println(str.substring(i));
                    break;
                }
                if (i == str.length() - 1) {
                    list.add(str);
                }
            }
        }

        String[] answer = new String[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }
}