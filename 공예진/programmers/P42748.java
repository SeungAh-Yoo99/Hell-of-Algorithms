//문제 링크: https://school.programmers.co.kr/learn/courses/30/lessons/42748
//시간: 0.56ms
//메모리: 72.4MB

import java.io.*;
import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {

        int[] answer = new int[commands.length];

        for (int l = 0; l < commands.length; l++) {
            int[] command = commands[l];
            int i = command[0];
            int j = command[1];
            int k = command[2];

            int[] sliced = new int[j - i + 1];
            for (int m = i - 1; m < j; m++) {
                sliced[m - i + 1] = array[m];
            }
            Arrays.sort(sliced);
            answer[l] = sliced[k - 1];
        }

        return answer;
    }
}