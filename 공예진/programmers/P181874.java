//문제: https://school.programmers.co.kr/learn/courses/30/lessons/181874
//시간: 17.90ms
//메모리: 82.5MB

class Solution {
    public String solution(String myString) {
        String answer = "";
        for (int i = 0; i < myString.length(); i++) {
            if (myString.charAt(i) == 'a') {
                answer += "A";
            } else if (myString.charAt(i) != 'A' && Character.isUpperCase(myString.charAt(i))) {
                answer += Character.toLowerCase(myString.charAt(i));
            } else {
                answer += myString.charAt(i);
            }
        }
        return answer;
    }
}