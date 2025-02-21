//문제링크 https://www.acmicpc.net/problem/2206
//시간 700ms
//메모리 143348KB


import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());

        int numN = Integer.parseInt(st.nextToken());
        int numM = Integer.parseInt(st.nextToken());

        if (numN - 1 == 0 && numM - 1 == 0) {
            System.out.print(1);
            System.exit(0);
        }

        int[] dx = {1, 0, -1, 0};
        int[] dy = {0, 1, 0, -1};

        char[][] miro = new char[numN][numM];
        int[][] dist = new int[numN][numM];
        boolean[][][] visit = new boolean[2][numN][numM];
        Queue<int[]> qu = new LinkedList<>();

        for (int i = 0; i < numN; i++) {
            String s = bf.readLine();
            for (int j = 0; j < numM; j++) {
                miro[i][j] = s.charAt(j);
            }
        }

        qu.offer(new int[]{0, 0, 0});

        while (!qu.isEmpty()) {
            int[] cur = qu.poll();

            for (int i = 0; i < 4; i++) {
                int nX = cur[0] + dx[i];
                int nY = cur[1] + dy[i];

                if (nX < 0 || nX >= numN || nY < 0 || nY >= numM) {
                    continue;
                }

                if (miro[nX][nY] == '1') {
                    if (cur[2] == 0 && !visit[1][nX][nY]) {
                        visit[cur[2]][nX][nY] = true;
                        dist[nX][nY] = dist[cur[0]][cur[1]] + 1;
                        qu.offer(new int[]{nX, nY, 1});
                    }
                } else {
                    if (!visit[cur[2]][nX][nY]) {
                        visit[cur[2]][nX][nY] = true;
                        dist[nX][nY] = dist[cur[0]][cur[1]] + 1;
                        qu.offer(new int[]{nX, nY, cur[2]});
                    }
                }

                if (nX == numN - 1 && nY == numM - 1) {
                    System.out.print(dist[nX][nY] + 1);
                    System.exit(0);
                }
            }
        }

        System.out.print(-1);
    }
}
