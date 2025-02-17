//문제: https://school.programmers.co.kr/learn/courses/30/lessons/181837
//시간: 0.71ms
//메모리: 69.9MB

class Solution {
    public int solution(String[] order) {
        int answer = 0;
        for (int i = 0; i < order.length; i++) {
            if (order[i].contains("latte")) {
                answer += 5000;
            } else {
                answer += 4500;
            }
        }
        return answer;
    }
}