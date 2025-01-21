/**
 * 문제 링크: https://school.programmers.co.kr/learn/courses/30/lessons/120842
 * 시간: 0.03ms
 * 메모리: 70MB
 * pr규칙: yymmdd 사이트명 문제번호 언어
 */

package programmers;

public class P120842 {
    public int[][] solution(int[] num_list, int n) {
        int repeat = num_list.length / n;
        int[][] answer = new int[repeat][n];
        int index = 0;

        for (int i = 0; i < repeat; i++) {
            for (int j = 0; j < n; j++) {
                answer[i][j] = num_list[index++];
            }
        }
        return answer;
    }
}
