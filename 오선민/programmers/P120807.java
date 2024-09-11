/** 문제 링크: https://school.programmers.co.kr/learn/courses/30/lessons/120807
 * 시간: 0.04 ms
 * 메모리: 75.5 MB
 * pr규칙: yymmdd 사이트명 문제번호 언어
 */
package programmers;

public class P120807 {
    class Solution {
        public int solution(int num1, int num2) {

            if (num1 == num2) {
                return 1;
            } else {
                return -1;
            }

        }
    }

    public static void main(String[] args) {
        P120807 p = new P120807();
        Solution sol = p.new Solution();
        int result = sol.solution(4, 2);
        System.out.println(result);
    }
}
