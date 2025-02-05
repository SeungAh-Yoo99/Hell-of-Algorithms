//문제 링크: https://school.programmers.co.kr/learn/courses/30/lessons/181903
//시간: 0.12ms
//메모리: 88.1MB

class Solution {
    public String solution(int q, int r, String code) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < code.length(); i++) {
            if (i % q == r) {
                sb.append(code.charAt(i));
            }
        }
        return sb.toString();
    }
}