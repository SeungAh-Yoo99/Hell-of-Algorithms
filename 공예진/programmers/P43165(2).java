//문제 링크: https://school.programmers.co.kr/learn/courses/30/lessons/43165
//시간: 4.60ms
//메모리: 83.6MB

class Solution {
    static int answer = 0;
    static int target;

    public int solution(int[] numbers, int target) {
        this.target = target;
        dfs(numbers, 0, 0);
        return answer;
    }

    public void dfs(int[] numbers, int idx, int sum) {
        if (idx > numbers.length - 1) {
            if (sum == target) {
                answer += 1;
            }
            return;
        }

        dfs(numbers, idx + 1, sum + numbers[idx]);
        dfs(numbers, idx + 1, sum - numbers[idx]);
    }
}