//문제: https://school.programmers.co.kr/learn/courses/30/lessons/42883
//시간: 1774.34ms
//메모리: 79.7MB

class Solution {
    public String solution(String number, int k) {
        StringBuilder sb = new StringBuilder(number);
        int idx = 0;

        while (k > 0 && idx < sb.length() - 1) {
            if (sb.charAt(idx) < sb.charAt(idx + 1)) {
                sb.deleteCharAt(idx);
                k--;
                if (idx > 0) idx--;
            } else {
                idx++;
            }
        }

        if (k > 0) {
            sb.delete(sb.length() - k, sb.length());
        }

        return sb.toString();
    }
}