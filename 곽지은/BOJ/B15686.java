//문제링크 https://www.acmicpc.net/problem/15686
//시간 236ms
//메모리 18968KB

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;

class Point {
    int x, y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

public class Main {
    static int numN, numM;
    static int[][] map;
    static ArrayList<Point> person, chicken;
    static int minDistance;
    static boolean[] selected;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        numN = Integer.parseInt(st.nextToken());
        numM = Integer.parseInt(st.nextToken());

        map = new int[numN][numN];
        person = new ArrayList<>();
        chicken = new ArrayList<>();

        for (int i = 0; i < numN; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < numN; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
                if (map[i][j] == 1) person.add(new Point(i, j));
                else if (map[i][j] == 2) chicken.add(new Point(i, j));
            }
        }

        minDistance = Integer.MAX_VALUE;
        selected = new boolean[chicken.size()];

        DFS(0, 0);
        bw.write(minDistance + "\n");
        bw.flush();
        bw.close();
        br.close();
    }

    public static void DFS(int start, int cnt) {
        if (cnt == numM) {
            int res = 0;

            for (Point p : person) {
                int temp = Integer.MAX_VALUE;
                for (int j = 0; j < chicken.size(); j++) {
                    if (selected[j]) {
                        int distance = Math.abs(p.x - chicken.get(j).x) + Math.abs(p.y - chicken.get(j).y);
                        temp = Math.min(temp, distance);
                    }
                }
                res += temp;
            }
            minDistance = Math.min(minDistance, res);
            return;
        }

        for (int i = start; i < chicken.size(); i++) {
            selected[i] = true;
            DFS(i + 1, cnt + 1);
            selected[i] = false;
        }
    }
}
