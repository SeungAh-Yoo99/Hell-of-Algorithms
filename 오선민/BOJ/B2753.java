/**
 * 문제 링크: https://www.acmicpc.net/problem/2753
 * 시간: 172 ms
 * 메모리: 17756 KB
 * pr규칙: yymmdd 사이트명 문제번호 언어
 */

package BOJ;

import java.util.Scanner;

public class B2753 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        sc.nextLine();

        if (year % 4 == 0 && year % 100 !=0 || year % 400 == 0){
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}
