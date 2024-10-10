// 문제 링크: https://www.acmicpc.net/problem/2578
// 시간: 64ms
// 메모리: 11544KB

import java.util.*;
import java.io.*;

public class Main {
    static int[][] board;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        board = new int[5][5];

        for (int i = 0; i < 5; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 5; j++) {
                board[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int num;
        int count = 0;
        boolean find = false;
        for (int i = 0; i < 5; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 5; j++) {
                num = Integer.parseInt(st.nextToken());
                count++;
                find(num);
                if (check()) {
                    find = true;
                    break;
                }
            }
            if (find) break;
        }

        System.out.println(count);
    }

    static void find(int num) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (board[i][j] == num) {
                    board[i][j] = 0;
                }
            }
        }
    }

    static boolean check() {
        int horizontal = 0;
        int vertical = 0;
        int diagonal1 = 0;
        int diagonal2 = 0;
        int count = 0;

        // 가로
        for (int i = 0; i < 5; i++) {
            horizontal = 0;
            for (int j = 0; j < 5; j++) {
                if (board[i][j] == 0) {
                    horizontal++;
                }
            }
            if (horizontal >= 5) count++;
        }

        // 세로
        for (int i = 0; i < 5; i++) {
            vertical = 0;
            for (int j = 0; j < 5; j++) {
                if (board[j][i] == 0) {
                    vertical++;
                }
            }
            if (vertical >= 5) count++;
        }

        // 내려가는 대각선
        for (int i = 0; i < 5; i++) {
            if (board[i][i] == 0) diagonal1++;
        }
        if (diagonal1 == 5) count++;

        // 올라가는 대각선
        for (int i = 0; i < 5; i++) {
            if (board[4 - i][i] == 0) diagonal2++;
        }
        if (diagonal2 == 5) count++;

        return count >= 3;
    }
}
