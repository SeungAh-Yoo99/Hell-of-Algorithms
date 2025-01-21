//문제 링크: https://school.programmers.co.kr/learn/courses/30/lessons/12969?language=java
//시간: 203.84ms
//메모리: 74.7MB

import java.util.Scanner;

class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}