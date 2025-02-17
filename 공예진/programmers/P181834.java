//문제: https://school.programmers.co.kr/learn/courses/30/lessons/181834
//시간: 12.14ms
//메모리: 87.7MB

class Solution {
    public String solution(String myString) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < myString.length(); i++) {
            if (myString.charAt(i) < 'l') {
                sb.append("l");
            } else {
                sb.append(myString.charAt(i));
            }
        }
        return sb.toString();
    }
}