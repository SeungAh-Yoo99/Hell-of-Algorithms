// 문제 링크: https://www.acmicpc.net/problem/15650
// 시간: 72 ms
// 메모리: 11540 KB

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int n , m;
    static boolean[] visited;
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken()); // 1부터 n 까지
        m = Integer.parseInt(st.nextToken()); // m개 뽑을 예정

        visited = new boolean[n+1];
        backTracking(1,0);

        System.out.println(sb.toString());
    }

    private static void backTracking(int number, int cnt) {


        if(cnt == m){
            for(int i = 1 ; i <= n ; i++){
                if(visited[i]){
                    sb.append(i).append(" ");
                }
            }
            sb.append("\n");
            return;
        }
        if(number == n+1){
            return;
        }

        if(!visited[number]){
            visited[number] = true;
            backTracking(number+1, cnt+1);
            visited[number] = false;
            backTracking(number+1,cnt);
        }
    }
}
