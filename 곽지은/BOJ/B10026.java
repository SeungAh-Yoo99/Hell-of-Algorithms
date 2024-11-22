//문제 링크 https://www.acmicpc.net/problem/10026
//시간 144ms
//메모리 16664KB


import java.io.*;
import java.util.*;
public class Main {
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};
    static char[][] map;
    static boolean[][] visit;
    static Queue<int[]> q = new LinkedList<>();
    static int n;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        n = Integer.parseInt(br.readLine());
        map = new char[n][n];
        visit = new boolean[n][n];
        for (int i = 0; i < n; i++) {
            String temp = br.readLine();
            for (int j = 0; j < n; j++) {
                map[i][j] = temp.charAt(j);
            }
        }
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (!visit[i][j]) {
                    cnt++;
                    bfs(i, j);
                }
            }
        }
        sb.append(cnt + " ");
        cnt = 0;
        visit = new boolean[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (!visit[i][j]) {
                    cnt++;
                    bfs(i, j);
                }
            }
        }
        sb.append(cnt);
        System.out.println(sb);
    }
    public static void bfs(int x, int y) {
        q.offer(new int[]{x, y});
        visit[x][y] = true;
        while (!q.isEmpty()) {
            int[] t = q.poll();
            int cx = t[0];
            int cy = t[1];
            for (int i = 0; i < 4; i++) {
                int nx = cx + dx[i];
                int ny = cy + dy[i];
                if (nx < 0 || ny < 0 || nx >= n || ny >= n) continue;
                if (visit[nx][ny] || map[cx][cy] != map[nx][ny]) continue;
                visit[nx][ny] = true;
                q.offer(new int[]{nx, ny});
            }
            if (map[cx][cy] == 'G')
                map[cx][cy] = 'R';
        }
    }
}
