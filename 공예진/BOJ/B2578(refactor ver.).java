//문제 링크: https://www.acmicpc.net/problem/2578
//시간: 64ms
//메모리: 115922KB

import java.io.*;
import java.util.*;

public class Main {
    /**
     * 리팩토링 : Map<Integer, int[]>를 사용하여 숫자 num이 위치한 좌표를 바로 찾아낼 수 있도록 함
     */

    static int[][] bingo = new int [5][5];
    static int bingocnt = 0;
    static Map<Integer, int[]> numPosition = new HashMap<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        // 빙고판 입력
        for (int i = 0; i < 5; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < 5; j++) {
                bingo[i][j] = Integer.parseInt(st.nextToken());
                numPosition.put(bingo[i][j], new int[] {i, j});
            }
        }

        int answer = 0;

        // 사회자가 부른 숫자 입력
        for (int i = 0; i < 5; i++) {
            st = new StringTokenizer(br.readLine(), " ");

            for (int j = 0; j < 5; j++) {
                int num = Integer.parseInt(st.nextToken());

                int[] position = numPosition.get(num);
                int idx_x = position[0];
                int idx_y = position[1];

                bingo[position[0]][position[1]] = 0;

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


    // 반대 대각선
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

