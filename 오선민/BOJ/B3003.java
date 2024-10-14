/**
 * 문제 링크: https://www.acmicpc.net/problem/3003
 * 시간: 184 ms
 * 메모리: 18308 KB
 * pr규칙: yymmdd 사이트명 문제번호 언어
 */
package BOJ;

import java.util.Scanner;

public class B3003 {
    public static void main(String[] args) {
        // 킹, 퀸, 룩, 비숍, 나이트, 폰의 값을 input 받기
        Scanner sc = new Scanner(System.in);

        // 올바른 체스 피스
        int[] chessPieces = {1, 1, 2, 2, 2, 8};
        // 찾은 체스 피스
        int[] foundPieces = new int[chessPieces.length];
        for (int i =0; i < chessPieces.length; i++) {
            foundPieces[i] = sc.nextInt();
        }

        // 차이 계산 및 출력
        for (int i = 0; i < chessPieces.length; i++) {
            int diff = chessPieces[i] - foundPieces[i];
            if (i == chessPieces.length - 1) {
                System.out.println(diff);
            } else {
                System.out.print(diff + " ");
            }
        }
        sc.close();
    }
}