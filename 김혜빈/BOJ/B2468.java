package 김혜빈.BOJ;

// 문제 링크: https://www.acmicpc.net/problem/2468
// 시간: 176 ms
// 메모리: 16120 KB

import java.io.*;
import java.util.StringTokenizer;

public class B2468 {
    static int N; // 마을의 가로 세로 길이
    static int[][] town; // 마을의 높이 행렬
    static boolean[][] check; // 방문한 노드인지 확인하는 배열
    static int[][] dir = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}}; // 방향 배열

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());

        town = new int[N][N];
        int height = 0; // 최대 높이

        for(int i=0; i<N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j=0; j<N; j++) {
                town[i][j] = Integer.parseInt(st.nextToken());
                height = Math.max(height, town[i][j]);
            }
        }

        int result = 1; // 결과 (h=0 인 경우 무조건 1이므로 1로 초기화)
        for(int h=1; h<=height; h++) { // h=0 인 경우를 이미 고려했으므로 1부터 시작
            int cnt = 0; // 안전 구역의 개수
            check = new boolean[N][N]; // 높이가 달라질 때마다 체크 배열 초기화

            /* 행렬의 각 인덱스 별로 체크하기 위해 반복문 수행 */
            for(int i=0; i<N; i++) {
                for(int j=0; j<N; j++) {
                    /* 이때 마을의 인덱스가 기준이 되는 높이보다 높고 방문하지 않았을 경우 dfs 수행 */
                    if(town[i][j] > h && !check[i][j]) {
                        dfs(i, j, h);
                        cnt ++; // 안전 구역 1개 증가
                    }
                }
            }
            result = Math.max(result, cnt); // 현재 기준이 되는 높이의 안전구역 개수가 최대인지 확인
        }
        System.out.println(result);
    }

    static void dfs(int r, int c, int h) {
        check[r][c] = true; // 방문하였으므로 true 로 변경

        for(int[] d : dir) {
            int newR = r + d[0]; // 새로운 행
            int newC = c + d[1]; // 새로운 열

            if(newR >= 0 && newC >= 0 && newR < N && newC < N) {
                /* 새로운 인덱스의 높이가 기준이 되는 높이보다 높고 방문하지 않았을 경우 재귀 */
                if(town[newR][newC] > h && !check[newR][newC]) dfs(newR, newC, h);
            }
        }
    }
}
