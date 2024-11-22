// 문제링크: https://school.programmers.co.kr/learn/courses/30/lessons/12969?language=java
// 시간: 262.63ms
// 메모리: 72.9MB

import java.util.Scanner;

class Solution {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        for (int i = 0; i < b; i++) {
            for (int j = 0; j < a; j++) {
                sb.append("*");
            }
            sb.append("\n");
        }
        
        System.out.println(sb);
    }
}
