//문제: https://school.programmers.co.kr/learn/courses/30/lessons/181892
//시간: 0.03ms
//메모리: 91.5MB

import java.util.*;

class Solution {
    public int[] solution(int[] num_list, int n) {
        return Arrays.copyOfRange(num_list, n - 1, num_list.length);
    }
}