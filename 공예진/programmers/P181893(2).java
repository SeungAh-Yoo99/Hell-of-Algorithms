//문제: https://school.programmers.co.kr/learn/courses/30/lessons/181893
//시간: 8.77ms
//메모리: 88.5MB

import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[] query) {
        int start = 0;
        int end = 0;
        for (int i = 0; i < query.length; i++) {
            if (i % 2 == 0) {
                end = start + query[i];
            } else {
                start += query[i];
            }
        }

        return Arrays.copyOfRange(arr, start, end + 1);
    }
}