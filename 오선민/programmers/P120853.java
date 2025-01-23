/**
 * 문제 링크: https://school.programmers.co.kr/learn/courses/30/lessons/120853
 * 시간: 0.16ms
 * 메모리: 85.1MB
 * pr규칙: yymmdd 사이트명 문제번호 언어
 */


package programmers;

public class P120853 {
    public int solution(String s) {
        String arr[] = s.split(" ");
        int result = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals("Z")) {
                result -= Integer.parseInt(arr[i-1]);
            } else {
                result += Integer.parseInt(arr[i]);
            }
        }

        return result;
    }
}
