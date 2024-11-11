//문제 링크: https://school.programmers.co.kr/learn/courses/30/lessons/132267
//시간: 0.09ms
//메모리: 73.7MB

class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;

        while (n >= a) {
            answer += (n / a) * b;
            n = (n % a) + (n / a) * b;
        }

        return answer;
    }
}