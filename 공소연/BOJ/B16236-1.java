// 문제 링크: https://www.acmicpc.net/problem/16236
/// 시간: 112ms
// 메모리: 14664KB

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine());

        int[][] board = new int[n][n];
        int status; // 공간의 상태
        int[] start = new int[3]; // x, y, dist

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                status = Integer.parseInt(st.nextToken());
                board[i][j] = status;

                if (status == 9) {
                    start = new int[] {j, i, 0};
                }
            }
        }

        System.out.println(bfs(board, n, start));
    }

    static int bfs(int[][] board, int n, int[] start) {
        int[] dx = {0, -1, 0, 1};
        int[] dy = {-1, 0, 1, 0};

        PriorityQueue<int[]> q = new PriorityQueue<>((o1, o2) -> {
            if (o1[2] == o2[2]) {
                if (o1[1] == o2[1]) {
                    return o1[0] - o2[0];
                }
                return o1[1] - o2[1];
            }
            return o1[2] - o2[2];
        });
        boolean[][] visited = new boolean[n][n];
        visited[start[1]][start[0]] = true;
        board[start[1]][start[0]] = 0;
        q.offer(start);

        int distance = 0; // 총 최단거리
        int size = 2; // 처음 아기 상어의 크기는 2

        int ate = 0; // 먹은 물고기 수
        int[] pop;
        int x, y, count;
        int nx, ny;
        while (!q.isEmpty()) {
            pop = q.poll();
            x = pop[0];
            y = pop[1];
            count = pop[2];

            if (board[y][x] < size && board[y][x] > 0) {
                distance += count;
                if (++ate == size) {
                    ate = 0;
                    size++;
                }
                board[y][x] = 0;
                count = 0;
                visited = new boolean[n][n];
                visited[y][x] = true;
                q.clear();
            }

            for (int i = 0; i < 4; i++) {
                nx = x + dx[i];
                ny = y + dy[i];

                if (nx < 0 || nx >= n || ny < 0 || ny >= n) continue;
                if (!visited[ny][nx] && board[ny][nx] <= size) {
                    q.offer(new int[] {nx, ny, count + 1});
                    visited[ny][nx] = true;
                }
            }
        }
        return distance;
    }
}
