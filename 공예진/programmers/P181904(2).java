//문제 링크: https://school.programmers.co.kr/learn/courses/30/lessons/181904
//시간: 0.12ms
//메모리: 71.5MB

import java.util.*;

class Solution {
    public String solution(String my_string, int m, int c) {
        StringBuilder sb = new StringBuilder();
        for (int i = c - 1; i < my_string.length(); i += m) {
            sb.append(my_string.charAt(i));
        }
        return sb.toString();
    }
}