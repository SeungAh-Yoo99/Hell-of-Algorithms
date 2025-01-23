//문제 링크: https://school.programmers.co.kr/learn/courses/30/lessons/181884
//시간: 0.03ms
//메모리: 80.7MB

class Solution {
    public int solution(int[] numbers, int n) {
        int answer = 0;
        for (int i = 0; i < numbers.length; i++) {
            answer += numbers[i];
            if (answer > n) {
                break;
            }
        }
        return answer;
    }
}