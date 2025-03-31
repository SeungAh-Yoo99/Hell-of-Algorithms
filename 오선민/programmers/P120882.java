/**
 * 문제 링크: https://school.programmers.co.kr/learn/courses/30/lessons/120882
 * 시간: 0.68 ms
 * 메모리: 83.5 MB
 * pr규칙: yymmdd 사이트명 문제번호 언어
 */

package programmers;
import java.util.*;

public class P120882 {
    public int[] solution(int[][] score) {
        // 평균 점수
        List<double[]> avgs = new ArrayList<>();
        for (int i = 0; i < score.length; i++) {
            double avg = (score[i][0] + score[i][1]) / 2.0;
            avgs.add(new double[]{i, avg});
        }

        // 내림차순 정렬
        avgs.sort((a, b) -> Double.compare(b[1], a[1]));

        // 등수 매기기
        int[] result = new int[score.length];
        int rank = 1;
        for (int i = 0; i < avgs.size(); i++) {
            if (i > 0 && avgs.get(i)[1] != avgs.get(i-1)[1]) {
                rank = i + 1;
            }
            result[(int)avgs.get(i)[0]] = rank;
        }
        return result;
    }
}
