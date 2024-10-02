// 문제 링크: https://www.acmicpc.net/problem/2445
// 시간: 72ms
// 메모리: 11780KB

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        int star;
        int blank;
        for (int i = 1; i < n; i++) {
            star = i;
            blank = n - i;
            for (int j = 0; j < star; j++) {
                sb.append("*");
            }
            for (int j = 0; j < blank * 2; j++) {
                sb.append(" ");
            }
            for (int j = 0; j < star; j++) {
                sb.append("*");
            }
            sb.append("\n");
        }

        System.out.print(sb);
        for (int j = 0; j < n * 2; j++) {
            sb.append("*");
        }
        System.out.print(sb.reverse());
    }
}
