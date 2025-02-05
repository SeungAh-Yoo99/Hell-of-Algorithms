//문제 링크: https://school.programmers.co.kr/learn/courses/30/lessons/181899
//시간: 0.03ms
//메모리: 97.5MB

class Solution {
    public int[] solution(int start_num, int end_num) {
        int[] answer = new int[start_num - end_num + 1];

        for (int i = start_num; i >= end_num; i--) {
            answer[start_num - i] = i;
        }

        return answer;
    }
}