package 김혜빈.programmers;

// 문제 링크: https://school.programmers.co.kr/learn/courses/30/lessons/12927

import java.util.*;

public class P12927_arr {
    public long solution(int n, int[] works) {
        Arrays.sort(works); // 작업량을 오름차순으로 정렬

        long[] cnt = new long[works[works.length - 1] + 1]; // 작업량의 최대값 배열
        long sum = 0; // 작업량의 합

        for (int i = 0; i < works.length; i++) {
            sum += works[i]; // 전체 작업량 합계
            cnt[works[i]]++; // 각 작업 개수
        }

        // 작업량 합계가 남은 시간 n보다 작거나 같은 경우 모든 작업을 완료할 수 있음
        if (sum <= n) return 0; // 야근 피로도 = 0

        for (int i = cnt.length - 1; i > 1; i--) {
            if (cnt[i] < n) { // 작업량 모두 소진 가능한 경우
                cnt[i - 1] += cnt[i];
                n -= cnt[i];
                cnt[i] = 0;
            } else { // 작업량 모두 소진 불가능한 경우
                cnt[i] -= n;
                cnt[i - 1] += n;
                n = 0;
                break;
            }
        }

        // n이 0이 아니라면 최소 작업량인 1에서 남은 n만큼 빼기
        if (n != 0) cnt[1] -= n;

        sum = 0; // 야근 피로도
        for (int i = 1; i < cnt.length; i++) {
            if (cnt[i] == 0) continue; // 작업량이 0인 경우 pass
            else sum += i * i * cnt[i]; // 작업량 0이 아닌 경우
        }

        return sum;
    }
}
