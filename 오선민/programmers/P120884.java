/**
 * 문제 링크: https://school.programmers.co.kr/learn/courses/30/lessons/120884
 * 시간: 0.02 ms
 * 메모리: 84.6 MB
 * pr규칙: yymmdd 사이트명 문제번호 언어
 */

package programmers;

public class P120884 {
    public int solution(int chicken) {
        int result = 0, service = 0;
        while (chicken >= 10) {
            service = chicken / 10; // 서비스 치킨 개수
            result += service;      // 결과에 추가
            chicken = service + (chicken % 10); // 남은 치킨 조각을 더해 새로운 치킨 개수 업데이트
        }
        return result;
    }
}
