//문제 링크: https://school.programmers.co.kr/learn/courses/30/lessons/181900
//시간: 0.52ms
//메모리: 87.8MB

import java.util.*;

class Solution {
    public String solution(String my_string, int[] indices) {
        String answer = "";
        StringBuilder sb = new StringBuilder(my_string);

        Arrays.sort(indices);
        for (int i = indices.length - 1; i >= 0; i--) {
            sb.deleteCharAt(indices[i]);
        }

        return sb.toString();
    }
}