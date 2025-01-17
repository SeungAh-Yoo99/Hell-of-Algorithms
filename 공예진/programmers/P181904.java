//문제 링크: https://school.programmers.co.kr/learn/courses/30/lessons/181904
//시간: 0.21ms
//메모리: 71.9MB

import java.util.*;

class Solution {
    public String solution(String my_string, int m, int c) {
        String answer = "";

        // m 개로 나눠서 배열에 담기
        String[] arr = new String[my_string.length() / m];
        int idx = 0;
        for (int i = 0; i < my_string.length() / m; i++) {
            arr[i] = my_string.substring(idx, idx + m);
            idx+=m;
        }

        // 각 요소의 c번째 열에 적힌 글자 뽑기
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            sb.append(arr[i].charAt(c - 1));
        }

        return sb.toString();
    }
}