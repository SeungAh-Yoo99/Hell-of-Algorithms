// 링크: https://school.programmers.co.kr/learn/courses/30/lessons/42748?language=java
// 시간: 0.39ms
// 메모리: 88.7MB

import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int len = commands.length;
        int[] answer = new int[len];
        
        int[] subArray;
        for (int i = 0; i < len; i++) {
            subArray = Arrays.copyOfRange(array, commands[i][0] - 1, commands[i][1]);
            Arrays.sort(subArray);
            answer[i] = subArray[commands[i][2] - 1];
        }

        return answer;
    }
}
