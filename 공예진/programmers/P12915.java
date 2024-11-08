//문제 링크: https://school.programmers.co.kr/learn/courses/30/lessons/12915
//시간:
//메모리:

class Solution {
    public String[] solution(String[] strings, int n) {
        String[] answer = new String[strings.length + 1];

        for (int i = 0; i < strings.length; i++) {
            if (i == 0) {
                answer[i] = strings[i];
            } else {
                char ch = strings[i].charAt(n);
                if (answer[i - 1].charAt(n) < ch) {
                    answer[i] = strings[i];
                }
            }
        }
        return answer;
    }
}