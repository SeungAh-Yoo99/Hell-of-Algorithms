/**
 * 문제 링크: https://school.programmers.co.kr/learn/courses/30/lessons/12950
 * 시간: 7.13 ms
 * 메모리: 131 MB
 * pr규칙: yymmdd 사이트명 문제번호 언어
 */

package programmers;

public class P12950 {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = new int[arr1.length][arr1[0].length];
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[0].length; j++) {
                answer[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
        return answer;
    }
}
