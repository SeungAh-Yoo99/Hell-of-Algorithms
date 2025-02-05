//문제: https://school.programmers.co.kr/learn/courses/30/lessons/181872
//시간: 0.25ms
//메모리: 75.4MB

class Solution {
    public String solution(String myString, String pat) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < pat.length(); i++) {
            sb.append("*");
        }
        String replaceStr = sb.toString();

        String str = myString.replace(pat, replaceStr);
        for (int i = str.length() - 1; i >= 0; i--) {
            if (str.charAt(i) == '*') {
                System.out.println(i);
                answer = myString.substring(0, i + 1);
                break;
            }
        }
        return answer;
    }
}