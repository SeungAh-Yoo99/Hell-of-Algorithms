//문제 링크: https://school.programmers.co.kr/learn/courses/30/lessons/12930?language=java
//시간: 2.24ms
//메모리: 65.1MB

import java.util.*;
import java.io.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        int cnt = 0;

        String[] arr = s.split("");

        // 공백이면 cnt = 0으로 초기화
        for (String str : arr) {
            cnt = str.equals(" ") ? 0 : cnt + 1;
            answer += (cnt % 2 == 0) ? str.toLowerCase() : str.toUpperCase();
        }

        return answer;
    }
}