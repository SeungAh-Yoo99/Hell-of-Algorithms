// 문제 링크: https://www.acmicpc.net/problem/16236
/// 시간: 116ms
// 메모리: 14764KB

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static int[] dx = {0, -1, 0, 1};
    static int[] dy = {-1, 0, 1, 0};
    static int[][] board;
    static int n;

    static class BabyShark {
        int x;
        int y;
        int size = 2; // 아기 상어의 크기
        int count = 0; // 먹은 물고기의 수

        BabyShark(int x, int y) {
            this.x = x;
            this.y = y;
        }

        void ate() {
            if (++count == size) {
                size++;
                count = 0;
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        n = Integer.parseInt(br.readLine());

        board = new int[n][n];
        int status; // 공간의 상태
        BabyShark shark = null;

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                status = Integer.parseInt(st.nextToken());
                board[i][j] = status;

                if (status == 9) {
                    shark = new BabyShark(j, i);
                    board[i][j] = 0;
                }
            }
        }

        int distance = 0; 
        int total = 0; // 총 최단거리
        while (true) {
            distance = eatFish(shark);
            if (distance == 0) break;
            total += distance;
        }

        System.out.println(total);
    }

    static int eatFish(BabyShark shark) {
        Queue<int[]> q = new PriorityQueue<>((o1, o2) -> {
            if (o1[2] == o2[2]) {
                if (o1[1] == o2[1]) {
                    return o1[0] - o2[0];
                }
                return o1[1] - o2[1];
            }
            return o1[2] - o2[2];
        });

        boolean[][] visited = new boolean[n][n];
        visited[shark.y][shark.x] = true;
        q.offer(new int[] {shark.x, shark.y, 0}); // 상어 x, 상어 y, 현재 거리

        int[] pop;
        int x, y, count, nx, ny;
        while (!q.isEmpty()) {
            pop = q.poll();
            x = pop[0];
            y = pop[1];
            count = pop[2];

            if (board[y][x] < shark.size && board[y][x] > 0) {
                board[y][x] = 0;
                shark.ate();
                shark.x = x;
                shark.y = y;
                return count;
            }

            for (int i = 0; i < 4; i++) {
                nx = x + dx[i];
                ny = y + dy[i];

                if (nx < 0 || nx >= n || ny < 0 || ny >= n) continue;
                if (!visited[ny][nx] && board[ny][nx] <= shark.size) {
                    q.offer(new int[] {nx, ny, count + 1});
                    visited[ny][nx] = true;
                }
            }
        }
        return 0;
    }
}
