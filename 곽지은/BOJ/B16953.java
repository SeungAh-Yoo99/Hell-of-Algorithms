//문제링크 https://www.acmicpc.net/problem/16953
//시간 672ms 
//메모리 997132KB


import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int start = Integer.parseInt(st.nextToken());
        int end = Integer.parseInt(st.nextToken());
        bw.write(BFS(start, end) + "");
        bw.flush();
        bw.close();
        br.close();
    }

    static int BFS(int start, int end) {
        Queue<Integer> q = new LinkedList<>();
        boolean[] visited = new boolean[end + 1];
        q.add(start);
        visited[start] = true;
        int answer = 0;
        while (!q.isEmpty()) {
            int size = q.size();
            for (int i = 0; i < size; i++) {
                int cur = q.poll();
                if (cur == end) return answer + 1;
                long temp = cur * 2L;
                if (temp <= end && !visited[(int) temp]) {
                    visited[(int) temp] = true;
                    q.add((int) temp);
                }
                temp = cur * 10L + 1;
                if (temp <= end && !visited[(int) temp]) {
                    visited[(int) temp] = true;
                    q.add((int) temp);
                }
            }
            answer++;
        }
        return -1;
    }
}
