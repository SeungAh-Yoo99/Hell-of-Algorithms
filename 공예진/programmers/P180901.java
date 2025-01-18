//문제 링크: https://school.programmers.co.kr/learn/courses/30/lessons/42586
//시간: 5.00ms
//메모리: 72.6MB

class Solution {
    public int[] solution(int n, int k) {
        int[] answer = new int[n / k];

        int idx = 0;
        for (int i = 1; i <= n; i++) {
            if (i % k == 0) {
                answer[idx] = i;
                idx++;
            }
        }
        return answer;
    }
}