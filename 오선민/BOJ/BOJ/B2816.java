/**
 * 문제 링크: https://www.acmicpc.net/problem/2816
 * 시간: 100ms
 * 메모리: 14088KB
 * pr규칙: yymmdd 사이트명 문제번호 언어
 */
package BOJ;

import java.io.*;

public class B2816 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int k1 = -1, k2 = -1;
        for (int i = 0; i < N; i++) {
            String ch = br.readLine();
            if (ch.equals("KBS1")) {k1 = i;}
            if (ch.equals("KBS2")) {k2 = i;}
        }

        if (k1 > k2) {k2++;}

        StringBuilder sb = new StringBuilder();
        sb.append("1".repeat(k1));
        sb.append("4".repeat(k1));
        sb.append("1".repeat(k2));
        sb.append("4".repeat(k2-1));
        System.out.println(sb.toString().trim());
    }
}
