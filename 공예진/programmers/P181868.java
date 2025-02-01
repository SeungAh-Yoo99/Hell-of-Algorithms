//문제: https://school.programmers.co.kr/learn/courses/30/lessons/181868
//시간: 0.20ms
//메모리: 81.7MB

import java.util.*;

class Solution {
    public String[] solution(String my_string) {
        String[] arr = my_string.split(" ");
        List<String> list = new ArrayList<>();

        for (String str : arr) {
            if (!str.equals("")) {
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