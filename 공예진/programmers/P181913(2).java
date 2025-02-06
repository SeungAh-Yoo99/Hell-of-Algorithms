//문제 링크: https://school.programmers.co.kr/learn/courses/30/lessons/181913
// 시간: 52.99ms
// 메모리: 91.9MB

import java.util.*;

class Solution {
    public String solution(String my_string, int[][] queries) {
        char[] arr = my_string.toCharArray();
        for (int[] q : queries) {
            int s = q[0];
            int e = q[1];

            while (s < e) {
                char temp = arr[s];
                arr[s] = arr[e];
                arr[e] = temp;
                s++;
                e--;
            }
        }

        String answer = "";
        for (char c : arr) {
            answer += c;
        }

        return answer;
    }
}