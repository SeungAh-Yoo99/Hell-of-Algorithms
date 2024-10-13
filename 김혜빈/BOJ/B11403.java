package 김혜빈.BOJ;

// 문제 링크: https://www.acmicpc.net/problem/11403
// 시간: 116 ms
// 메모리: 14524 KB

import java.io.*;
import java.util.*;

public class B11403 {
    static List<List<Integer>> graph; // 그래프
    static int[][] result; // 결과 인접 행렬

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine()); // 정점 개수
        graph = new ArrayList<>();
        for (int i = 0; i < N; i++) graph.add(new ArrayList<>());
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) if (st.nextToken().equals("1")) graph.get(i).add(j);
        }

        result = new int[N][N];
        for(int i=0; i<N; i++) dfs(graph.get(i), i); // dfs 순회

        for(int[] arr:result) {
            for(int i:arr) sb.append(i).append(" ");
            sb.append("\n");
        }

        bw.append(sb.toString());
        bw.close();
    }

    private static void dfs(List<Integer> list, int row) {
        for(int col:list) {
            if(result[row][col] == 0) {
                result[row][col] = 1;
                dfs(graph.get(col), row);
            }
        }
    }
}
