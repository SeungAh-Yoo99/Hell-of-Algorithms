//문제 링크: https://school.programmers.co.kr/learn/courses/30/lessons/43165
//시간: 10.27ms
//메모리: 75.7MB

import java.util.*;

class Solution {
    static int answer = 0;
    static int[] arr;
    static int N;
    static int T;

    public int solution(int[] numbers, int target) {
        N = numbers.length;
        T = target;
        arr = numbers;

        backtracking(0, 0);
        return answer;
    }

    public static void backtracking(int sum, int index) {

        if (index == N) {
            if (sum == T) {
                answer++;
            }
            return;
        }

        backtracking(sum - arr[index], index + 1);
        backtracking(sum + arr[index], index + 1);
    }
}