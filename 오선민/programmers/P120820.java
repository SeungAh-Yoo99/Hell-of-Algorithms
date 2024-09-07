/**
 * 문제 링크: https://school.programmers.co.kr/learn/courses/30/lessons/120820
 * 시간: 0.03 ms
 * 메모리: 74.6 MB
 * pr규칙: yymmdd 사이트명 문제번호 언어
 */
package programmers;

import java.util.Scanner;

public class P120820 {
    static class Solution {
        public int solution(int age) {
            return (2023 - age);
        }
    }
    public static void main(String[] args) {
        Solution solution = new Solution();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter age: ");
        int age = scanner.nextInt();

        int birthYear = solution.solution(age);
        System.out.println("Birth year: " + birthYear);
    }
}
