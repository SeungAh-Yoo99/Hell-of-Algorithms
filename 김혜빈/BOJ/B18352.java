package 김혜빈.BOJ;

// 문제 링크: https://www.acmicpc.net/problem/18352
// 시간: 1316 ms
// 메모리: 336740 KB

import java.io.*;
import java.util.*;

public class B18352 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken()); // 도시의 개수
        int M = Integer.parseInt(st.nextToken()); // 도로의 개수
        int K = Integer.parseInt(st.nextToken()); // 최단 거리
        int X = Integer.parseInt(st.nextToken()); // 출발 도시

        List<List<Integer>> map = new ArrayList<>(); // 도시 그래프
        for(int i=0; i<=N; i++) map.add(new ArrayList<>()); // 각 리스트 초기화
        for(int i=0; i<M; i++) {
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            map.get(start).add(end); // 단방향 연결
        }

        Queue<Integer> queue = new ArrayDeque<>();
        queue.add(X); // X 부터 시작

        int[] cnt = new int[N + 1]; // X 로부터 각 도시의 길이를 저장할 배열
        while(!queue.isEmpty()) {
            int current = queue.poll();
            for(int i : map.get(current)) {
                /* 현재 도시에서의 map 을 돌면서 방문하지 않은 동시에 자기 자신이 아닌 경우 길이 저장 */
                if(cnt[i] == 0 && i != X) {
                    cnt[i] = cnt[current] + 1;
                    queue.add(i); // 방문하지 않고 자기 자신이 아니어야만 queue 에 추가
                }
            }
        }

        for(int i=0; i<=N; i++) if(cnt[i] == K) sb.append(i).append("\n"); // 길이가 K 인 도시 출력
        if(sb.length() == 0) sb.append("-1"); // 길이가 K 인 도시가 없다면 -1 출력
        bw.write(sb.toString());
        bw.close();
        br.close();
    }
}