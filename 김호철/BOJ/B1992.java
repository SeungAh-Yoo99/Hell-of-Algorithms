// 문제 링크:https://www.acmicpc.net/problem/1992
// 시간: 88 ms
// 메모리: 12800 KB

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static int[][] board;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        board = new int[n][n];

        for (int i = 0; i < n; i++) { // 보드에 넣기
            String s = br.readLine(); 
            String[] arr = s.split("");
            for (int j = 0; j < n; j++) {
                board[i][j] = Integer.parseInt(arr[j]);
            }
        }
        quad(0, 0, n, n); // 시작 가로 , 시작 세로, 끝 가로, 끝 세로 순으로 넣어줬다.
        System.out.println(sb.toString());
    }

    private static void quad(int startRow, int startCol, int endRow, int endCol) {
        int temp = board[startRow][startCol]; // 제일 왼쪽위 수를 우선 담아뒀다,

        for (int i = startRow; i < endRow; i++) {
            for (int j = startCol; j < endCol; j++) {
                if (temp != board[i][j]) { // temp와 다른 수가 나온 순간 4부분으로 분할하여 재귀하고 이 함수는 종료
                    sb.append("(");
                    quad(startRow, startCol, (startRow + endRow) / 2, (startCol + endCol) / 2); // 왼쪽 위
                    quad(startRow, (startCol + endCol) / 2, (startRow + endRow) / 2, endCol); // 오른쪽 위
                    quad((startRow + endRow) / 2, startCol, endRow, (startCol + endCol) / 2); // 왼쪽 아래
                    quad((startRow + endRow) / 2, (startCol + endCol) / 2, endRow, endCol); // 오른쪽 아래
                    sb.append(")");
                    return;
                }
            }
        }
        sb.append(temp);
    }
}
