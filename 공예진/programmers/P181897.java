//문제: https://school.programmers.co.kr/learn/courses/30/lessons/181897
//시간: 0.33ms
//메모리: 78.2MB

import java.util.*;

class Solution {
    public int[] solution(int n, int[] slicer, int[] num_list) {
        int a = slicer[0];
        int b = slicer[1];
        int c = slicer[2];

        if (n == 1) {
            return slice(0, b, 1, num_list);
        } else if (n == 2) {
            return slice(a, num_list.length - 1, 1, num_list);
        } else if (n == 3) {
            return slice(a, b, 1, num_list);
        } else {
            return slice(a, b, c, num_list);
        }
    }

    public int[] slice(int start, int end, int interval, int[] arr) {
        int length = (int) Math.ceil((end - start) / interval) + 1;
        int[] answer = new int[length];
        int idx = 0;

        for (int i = start; i <= end; i += interval) {
            answer[idx++] = arr[i];
        }

        return answer;
    }
}
