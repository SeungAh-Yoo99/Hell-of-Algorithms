//문제: https://school.programmers.co.kr/learn/courses/30/lessons/181873
//시간: 19.74ms
//메모리: 89.3MB

class Solution {
    public String solution(String my_string, String alp) {
        String answer = "";
        for (int i = 0; i < my_string.length(); i++) {
            if (my_string.charAt(i) == alp.charAt(0)) {
                answer += Character.toUpperCase(my_string.charAt(i));
            } else {
                answer += my_string.charAt(i);
            }
        }
        return answer;
    }
}