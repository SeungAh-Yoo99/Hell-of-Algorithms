/**
 * 문제 링크: https://school.programmers.co.kr/learn/courses/30/lessons/12941
 * 시간: 1.88 ms
 * 메모리: 54.6 MB
 * pr규칙: yymmdd 사이트명 문제번호 언어
 */

package programmers;
import java.util.*;

public class P12941 {
    public int solution(int []A, int []B){
        // Integer[] BInteger = Arrays.stream(B).boxed().toArray(Integer[]::new);
        // Arrays.sort(BInteger, Collections.reverseOrder());
        // 처음엔 B를 Integer array로 변경 후 reverse 하려고 했으나, 효율이 좋지 않아 다음과 같이 풀었습니다.
        Arrays.sort(A);
        Arrays.sort(B);
        int answer = 0;
        int n = B.length;
        for (int i = 0; i < A.length; i++) {
            answer += (A[i]*B[n-1-i]);
        }
        return answer;
    }
}
