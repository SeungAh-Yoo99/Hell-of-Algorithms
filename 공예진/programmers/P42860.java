//문제: https://school.programmers.co.kr/learn/courses/30/lessons/42860
//시간: 0.06ms
//메모리: 90MB

class Solution {
    public int solution(String name) {
        int answer = 0;
        int move = name.length() - 1;

        for (int i = 0; i < name.length(); i++) {
            // A로 변경
            answer += Math.min(name.charAt(i) - 'A', 'Z' - name.charAt(i) + 1);

            // 커서 이동
            int next = i + 1;

            // 연속된 A 건너뛰기
            while (next < name.length() && name.charAt(next) == 'A') {
                next++;
            }

            // 앞쪽으로 돌아가기
            move = Math.min(move, (i * 2) + name.length() - next);
            // 뒷쪽으로 돌아가기
            move = Math.min(move, (name.length() - next) * 2 + i);
        }

        answer += move;
        return answer;
    }
}