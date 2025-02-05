//문제: https://school.programmers.co.kr/learn/courses/30/lessons/181862
//시간: 147.10ms
//메모리: 108MB

import java.util.*;

class Solution {
    public String[] solution(String myStr) {
        String[] str = myStr.split("[abc]");

        List<String> list = new ArrayList<>();
        for (int i = 0; i < str.length; i++) {
            if (!str[i].equals("")) {
                list.add(str[i]);
            }
        }

        String[] answer = new String[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }

        return (answer.length == 0) ? new String[]{"EMPTY"} : answer;
    }
}