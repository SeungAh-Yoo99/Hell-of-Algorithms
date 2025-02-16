//문제: https://school.programmers.co.kr/learn/courses/30/lessons/181839
//시간: 0.04ms
//메모리: 73.4MB

class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        if (a % 2 != 0 && b % 2 != 0) {
            answer = a * a + b * b;
        } else if (a % 2 != 0 || b % 2 != 0) {
            answer = 2 * (a + b);
        } else {
            answer = Math.abs(a - b);
        }
        return answer;
    }
}