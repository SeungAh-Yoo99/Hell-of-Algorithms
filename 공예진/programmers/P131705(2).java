//문제 링크: https://school.programmers.co.kr/learn/courses/30/lessons/131705
//시간: 0.14ms
//메모리: 82.1MB

class Solution {
    static int[] temp = new int[3];
    static int answer = 0;

    public int solution(int[] number) {
        dfs(number, 0, 0);
        return answer;
    }

    public void dfs(int[] number, int start, int depth) {
        if (depth == 3) {
            int sum = 0;
            for (int i = 0; i < 3; i++) {
                sum += temp[i];
            }

            if (sum == 0) {
                answer++;
            }
            return;
        }

        for (int i = start; i < number.length; i++) {
            temp[depth] = number[i];
            dfs(number, i + 1, depth + 1);
        }
    }
}