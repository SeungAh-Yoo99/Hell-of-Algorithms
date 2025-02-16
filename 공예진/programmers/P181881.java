//문제: https://school.programmers.co.kr/learn/courses/30/lessons/181881
//시간: 75.72ms
//메모리: 165MB

import java.util.*;

class Solution {
    public int solution(int[] arr) {
        int answer = 0;
        int[] comparedArr = new int[arr.length];
        boolean flag = true;

        while (flag) {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] >= 50 && arr[i] % 2 == 0) {
                    comparedArr[i] = arr[i] / 2;
                } else if (arr[i] < 50 && arr[i] % 2 != 0) {
                    comparedArr[i] = arr[i] * 2 + 1;
                } else {
                    comparedArr[i] = arr[i];
                }
            }

            if (Arrays.equals(arr, comparedArr)) {
                flag = false;
            } else {
                arr = Arrays.copyOf(comparedArr, comparedArr.length);
                answer++;
            }
        }

        return answer;
    }
}