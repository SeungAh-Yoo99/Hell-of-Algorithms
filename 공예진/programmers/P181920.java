//문제 링크: https://school.programmers.co.kr/learn/courses/30/lessons/181920
//시간: 0.03ms
//메모리: 85.5MB

class Solution {
    public int[] solution(int start_num, int end_num) {
        int[] answer = new int[end_num - start_num + 1];

        for (int i = start_num; i <= end_num; i++) {
            answer[i - start_num] = i;
        }

        return answer;
    }
}