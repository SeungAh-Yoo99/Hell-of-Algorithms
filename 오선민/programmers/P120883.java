/**
 * 문제 링크: https://school.programmers.co.kr/learn/courses/30/lessons/120883
 * 시간: 0.02 ms
 * 메모리: 72 MB
 * pr규칙: yymmdd 사이트명 문제번호 언어
 */


package programmers;

public class P120883 {
    public String solution(String[] id_pw, String[][] db) {
        for (int i = 0; i < db.length; i++) {
            if (id_pw[0].equals(db[i][0]) && id_pw[1].equals(db[i][1])) {
                return "login";
            } else if (id_pw[0].equals(db[i][0])) {
                return "wrong pw";
            }
        }
        return "fail";
    }
}
