//문제 링크: https://www.acmicpc.net/problem/2578
//시간: 68ms
//메모리: 11560KB

import java.io.*;
import java.util.*;

public class Main {

    static int[][] bingo = new int [5][5];
    static int bingocnt = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        // 빙고판 입력
        for (int i = 0; i < 5; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < 5; j++) {
                bingo[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int answer = 0;

        // 사회자가 부른 숫자 입력
        for (int i = 0; i < 5; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < 5; j++) {
                int num = Integer.parseInt(st.nextToken());

                int idx_x = 0;
                int idx_y = 0;

                for (int k = 0; k < 5; k++) {
                    for (int l = 0; l < 5; l++) {
                        if (num == bingo[k][l]) {
                            bingo[k][l] = 0;
                        }
                    }
                }

                checkWidth();
                checkLength();
                checkDiagonal();
                checkOppositeDiagonal();

                answer++;
                if (bingocnt >= 3) {
                    System.out.println(answer);
                    return;
                }
                bingocnt = 0;
            }
        }

    }

    // 가로
    public static void checkWidth() {

        for (int i = 0; i < 5; i++) {
            int cnt = 0;
            for (int j = 0; j < 5; j++) {
                if (bingo[i][j] == 0) {
                    cnt++;
                }
            }
            if (cnt == 5) {
                bingocnt++;
            }
        }
    }

    // 세로
    public static void checkLength() {
        for (int i = 0; i < 5; i++) {
            int cnt = 0;
            for (int j = 0; j < 5; j++) {
                if (bingo[j][i] == 0) {
                    cnt++;
                }
            }
            if (cnt == 5) {
                bingocnt++;
            }
        }
    }

    // 대각선
    public static void checkDiagonal() {
        int cnt = 0;
        for (int i = 0; i < 5; i++) {
            if (bingo[i][i] == 0) {
                cnt++;
            }
        }

        if (cnt == 5) {
            bingocnt++;
        }
    }


    // 반대 각
    public static void checkOppositeDiagonal() {
        int cnt = 0;
        for (int i = 0; i < 5; i++) {
            if (bingo[i][4-i] == 0) {
                cnt++;
            }
        }

        if (cnt == 5) {
            bingocnt++;
        }
    }
}
