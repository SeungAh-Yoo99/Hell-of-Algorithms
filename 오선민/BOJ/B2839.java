/**
 * 문제 링크: https://www.acmicpc.net/problem/2839
 * 시간: 172 ms
 * 메모리: 17752 KB
 * pr규칙: yymmdd 사이트명 문제번호 언어
 */
package BOJ;
import java.util.Scanner;

public class B2839 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result = -1;
        // 5kg 봉지를 최대한 많이 사용
        // 나머지를 3kg
        for (int i = n/5; i>=0; i--){
            int remainder = n - i*5;
            if (remainder%3 == 0){
                result = i + remainder/3;
                break;
            }
        }
        System.out.println(result);
    }
}