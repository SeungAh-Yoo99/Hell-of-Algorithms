//문제 링크: https://school.programmers.co.kr/learn/courses/30/lessons/181885
//시간: 0.04ms
//메모리: 94.9MB

import java.util.*;

class Solution {
    public String[] solution(String[] todo_list, boolean[] finished) {
        List<String> list = new ArrayList<>();

        for (int i = 0; i < finished.length; i++) {
            if (!finished[i]) {
                list.add(todo_list[i]);
            }
        }

        String[] answer = new String[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }
}