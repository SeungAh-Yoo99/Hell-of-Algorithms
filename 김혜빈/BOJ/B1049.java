package 김혜빈.BOJ;

// 문제 링크: https://www.acmicpc.net/problem/1049
// 시간: 68 ms
// 메모리: 11584 KB

import java.io.*;
import java.util.*;

public class B1049 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken()); // 끊어진 기타 줄의 개수
        int M = Integer.parseInt(st.nextToken()); // 가게 브랜드 수

        int six = 1000; // 6묶음의 최대 가격
        int one = 1000; // 개별 구매의 최대 가격

        for(int i=0; i<M; i++) {
            st = new StringTokenizer(br.readLine());
            six = Math.min(six, Integer.parseInt(st.nextToken()));
            one = Math.min(one, Integer.parseInt(st.nextToken()));
        }

        int price = 0; // 총 금액

        /* 6개보다 덜 사는 경우 */
        /* 6묶음을 1개 사는 것과 N개를 개별로 사는 것 중 어떤 경우가 더 싼 지 비교 */
        if(N < 6) price = six > one * N ? one * N : six;
        else {
        /* 6개 이상 사는 경우 */
            int p = (N % 6 == 0 ? N / 6 : N / 6 + 1) * six; // 개수에 상관 없이 6묶음으로만 사는 경우 가격
            p = Math.min(p, one * N); // 개수에 상관 없이 개별로만 사는 경우 가격 (비교해서 더 작은 값 리턴)
            p = Math.min(p, (N / 6) * six + one * (N % 6)); // 6묶음으로 살 수 있는 줄을 다 사고 나머지는 개별로 사는 가격 (위와 동일)
            price = p;
        }

        System.out.println(price);
    }
}
