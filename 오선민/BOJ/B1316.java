/**
 * 문제 링크: https://www.acmicpc.net/problem/1316
 * 시간: 168ms
 * 메모리: 17904KB
 * pr규칙: yymmdd 사이트명 문제번호 언어
 */
package BOJ;

import java.util.Scanner;

public class B1316 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int groupWordCount = 0;
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            String word = sc.nextLine();
            if (checkGroupWord(word)) {
                groupWordCount++;
            }
        }
        sc.close();
        System.out.println(groupWordCount);
    }

    // 알파벳 사용여부를 확인하는 함수(true or false)
    public static boolean checkGroupWord(String word) {
        // 알파벳 사용여부 배열
        boolean[] usedAlphabet = new boolean[26];
        char prevChar = ' '; // 이전 문자를 저장할 변수

        for (int i = 0; i < word.length(); i++) {
            char currentChar = word.charAt(i);
            // 이전 문자와 다를 때만 검사
            if (currentChar != prevChar) {
                // 기사용여부 확인
                if (usedAlphabet[currentChar - 'a']) {
                    return false;
                }
                usedAlphabet[currentChar - 'a'] = true;
            }
            prevChar = currentChar; // 현재 문자를 이전 문자로 넘기기
        }
        return true; // 모든 문자가 연속해서 나타나면 그룹 단어
    }
}
