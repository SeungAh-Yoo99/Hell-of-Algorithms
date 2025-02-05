//문제: https://school.programmers.co.kr/learn/courses/30/lessons/181879
//시간: 0.02ms
//메모리: 92.8MB

class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        if (num_list.length >= 11) {
            for (int num : num_list) {
                answer += num;
            }
        } else {
            answer = 1;
            for (int num : num_list) {
                answer *= num;
            }
        }
        return answer;
    }
}