// 문제 링크: https://school.programmers.co.kr/learn/courses/30/lessons/161989
// 시간: 2.22ms
// 메모리: 88MB

class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 0;

        int left = section[0]; // 윈도우 시작점
        int right = left + m - 1; // 윈도우 끝점
        int i = 0; // section의 인덱스

        int current;
        while (i < section.length) {
            current = section[i];

            // current가 윈도우 범위 내에 속하면
            if (current <= right) {
                i++;
            } else {
                answer++;
                left = current;
                right = left + m - 1;
            }
        }

        // right가 n보다 클 경우 else문이 실행되지 않으므로 한번 더 더해준다
        return answer + 1;
    }
}