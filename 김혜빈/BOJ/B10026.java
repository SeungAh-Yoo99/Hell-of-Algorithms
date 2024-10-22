package 김혜빈.BOJ;

// 문제 링크: https://www.acmicpc.net/problem/10026
// 시간: 68 ms
// 메모리: 12216 KB

import java.io.*;

public class B10026 {
    static int N;
    static int[] dx = {0, 0, 1, -1};
    static int[] dy = {1, -1, 0, 0};
    static boolean[][] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        int[][] arr1 = new int[N][N]; // 적록색약이 아닌 사람이 보는 그림
        int[][] arr2 = new int[N][N]; // 적록색약인 사람이 보는 그림

        for (int i = 0; i < N; i++) {
            String s = br.readLine();
            for (int j = 0; j < N; j++) {
                if (s.charAt(j) == 'R') arr1[i][j] = 1;
                else if (s.charAt(j) == 'G') arr1[i][j] = 2;
                else arr2[i][j] = 1;
            }
        }

        visited = new boolean[N][N];
        int[] result = new int[2]; // 결과

        for (int i = 0; i < N; i++) { // 적록색약이 아닌 사람이 보는 그림의 영역 구하는 dfs 순회
            for (int j = 0; j < N; j++) {
                if (visited[i][j]) continue;
                dfs(arr1, i, j, arr1[i][j]);
                result[0]++;
            }
        }

        visited = new boolean[N][N]; // 초기화
        for (int i = 0; i < N; i++) { // 적록색약인 사람이 보는 그림의 영역 구하는 dfs 순회
            for (int j = 0; j < N; j++) {
                if (visited[i][j]) continue;
                dfs(arr2, i, j, arr2[i][j]);
                result[1]++;
            }
        }

        System.out.println(result[0] + " " + result[1]);
    }

    private static void dfs(int[][] arr, int row, int col, int color) {
        visited[row][col] = true;
        for (int i = 0; i < 4; i++) {
            int r = row + dy[i];
            int c = col + dx[i];
            if (r >= 0 && c >= 0 && r < N && c < N && !visited[r][c] && arr[r][c] == color)
                dfs(arr, r, c, color);
        }
    }
}
