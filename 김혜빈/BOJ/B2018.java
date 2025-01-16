package 김혜빈.BOJ;

// 문제 링크: https://www.acmicpc.net/problem/2018
// 시간: 68 ms
// 메모리: 11484 KB

import java.io.*;

public class B2018 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        /* x + (x+1) + (x+2) + ... + (x+k -1) = N 인 경우
           1 + 2 + 3 + 4 + 5 (k = 연속하는 개수)
           kx + (1 + 2 + ... + k-1) = kx + k*(k-1)/2
           N = kx + k*(k-1)/2 (x = 시작하는 수)
           N - k*(k-1)/2 = kx
           (N - k*(k-1)/2)/k = x */

        int cnt = 0;
        for(int i=1; i*(i-1)/2<N; i++) {
            // (N - k*(k-1)/2)/k = x 이므로 N - k*(k-1)/2 를 k 로 나눈 나머지가 0인 경우, 즉 나누어 떨어지는 경우 수들의 합이 N을 만족
            if((N-i*(i-1)/2)%i == 0) cnt++;
        }

        System.out.print(cnt);
    }
}
