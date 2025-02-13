/**
 * 문제 링크: https://school.programmers.co.kr/learn/courses/30/lessons/120863
 * 시간: 8.12 ms
 * 메모리: 96.6 MB
 * pr규칙: yymmdd 사이트명 문제번호 언어
 */

package programmers;

public class P120863 {
    public String solution(String polynomial) {
        String[] arr = polynomial.split("\\+ ");
        int xSum = 0, numSum = 0;

        for (String term : arr) {
            term = term.trim();
            if (term.contains("x")) {
                term = term.equals("x") ? "1x" : term;
                xSum += Integer.parseInt(term.replace("x", ""));
            } else {
                numSum += Integer.parseInt(term);
            }
        }

        StringBuilder st = new StringBuilder();
        if (xSum > 0) {
            st.append(xSum == 1 ? "x" : xSum+"x");
        }
        if (numSum > 0) {
            st.append(xSum > 0 ? " + "+numSum : numSum);
        }
        return st.toString();
    }

}
