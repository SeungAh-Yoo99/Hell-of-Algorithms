//문제 링크: https://www.acmicpc.net/problem/10026
//시간: 132ms
//메모리: 14080KB

import java.util.*;
import java.io.*;

public class Main {
    static int N;
    static String[][] arr1;
    static String[][] arr2;
    static int[] X = {0, 0, 1, -1};
    static int[] Y = {1, -1, 0, 0};
    static int[][] visited1;
    static int[][] visited2;

    public static class Point {
        public int x, y;

        Point (int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        arr1 = new String[N][N];
        arr2 = new String[N][N];
        visited1 = new int[N][N];
        visited2 = new int[N][N];

        for (int i = 0; i < N; i++) {
            String[] str = br.readLine().split("");
            for (int j = 0; j < N; j++) {
                if (str[j].equals("G")) {
                    arr2[i][j] = "R";
                } else {
                    arr2[i][j] = str[j];
                }
                arr1[i][j] = str[j];
            }
        }

        int cnt1 = 0;
        int cnt2 = 0;

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                String color1 = arr1[i][j];
                if (visited1[i][j] == 0) {
                    bfs1(i, j, color1);
                    cnt1++;
                }

                String color2 = arr2[i][j];
                if (visited2[i][j] == 0) {
                    bfs2(i, j, color2);
                    cnt2++;
                }
            }
        }

        System.out.println(cnt1 + " " + cnt2);

    }

    public static void bfs1(int x, int y, String color) {
        Queue<Point> queue = new LinkedList<>();
        Point point = new Point(x, y);
        queue.add(point);
        visited1[x][y] = 1;

        while (!queue.isEmpty()) {
            Point p = queue.poll();

            for (int i = 0; i < X.length; i++) {
                int nx = p.x + X[i];
                int ny = p.y + Y[i];

                if (nx >= 0 && ny >= 0 && nx < N && ny < N && visited1[nx][ny] == 0 && arr1[nx][ny].equals(color)) {
                    queue.add(new Point(nx, ny));
                    visited1[nx][ny] = 1;
                }
            }

        }

    }

    public static void bfs2(int x, int y, String color) {
        Queue<Point> queue = new LinkedList<>();
        Point point = new Point(x, y);
        queue.add(point);
        visited2[x][y] = 1;

        while (!queue.isEmpty()) {
            Point p = queue.poll();

            for (int i = 0; i < X.length; i++) {
                int nx = p.x + X[i];
                int ny = p.y + Y[i];

                if (nx >= 0 && ny >= 0 && nx < N && ny < N && visited2[nx][ny] == 0 && arr2[nx][ny].equals(color)) {
                    queue.add(new Point(nx, ny));
                    visited2[nx][ny] = 1;
                }
            }

        }

    }

}
